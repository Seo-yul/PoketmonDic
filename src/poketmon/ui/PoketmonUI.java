package poketmon.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import poketmon.dao.PoketmonDAO;
import poketmon.vo.Poketmon;

public class PoketmonUI {
	private PoketmonDAO dao = new PoketmonDAO();
	private Poketmon poketmon = null;
	private ArrayList<Poketmon> arryPoketmon = new ArrayList<>();
	public static void main(String[] args) {
		PoketmonUI ui = new PoketmonUI();
//		ui.init();
//		ui.getWikidata("피카츄");
//		ui.kanjiDic();
//		ui.jp();
		ui.getWikiPhoto("이름입력?");
	}
	public void jp() { 
		Scanner sc = new Scanner(System.in);
		String kanji = sc.nextLine();
		String initUrl = "http://jpdic.naver.com/search.nhn?dicQuery="+kanji+"&x=0&y=0&query="+kanji+"&target=jpdic&ie=utf8&query_utf=&isOnlyViewEE=D";
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		try {
			Document doc = con.get();
			els = doc.select("dt.top_dt");
			System.out.print(els.text()+ " : ");
			System.out.println(els.next().text());
			System.out.print(els.next().next().text()+ " : ");
			System.out.println(els.next().next().next().text());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
	}
	
	public void kanjiDic() { 
		Scanner sc = new Scanner(System.in);
		String kanji = sc.nextLine();
		String initUrl = "https://kakijun.jp//main/u_kensaku.php?KANJI="+kanji;
		String imgUrl = null;
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		try {
			Document doc = con.get();
			els = doc.select("span.mihon100");
			System.out.println(els.text());
			
			imgUrl="https://kakijun.jp"+doc.select("#kjanimation").first().attr("src");
			System.out.println(imgUrl);
			URL url=new URL(imgUrl);
			
			InputStream is = url.openStream();
		    File file = new File("images\\"+kanji+".gif");
		    OutputStream os = new FileOutputStream(file);

		    byte[] b = new byte[2048];
		    int length =0;

		    while ((length = is.read(b)) != -1) {
		        os.write(b, 0, length);
		    }

		    is.close();
		    os.close();
			
			  
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
	}
	public void init() { 
		String initUrl = "http://ko.pokemon.wikia.com/wiki/%EA%B5%AD%EA%B0%80%EB%B3%84_%ED%8F%AC%EC%BC%93%EB%AA%AC_%EC%9D%B4%EB%A6%84_%EB%AA%A9%EB%A1%9D";
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		int count = 0;
		try {
			Document doc = con.get();
			els = doc.select("a.mw-redirect");
			for (Element ee : els) {
				getWikidata((ee.text()));
				count ++;
				if(count==806)break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
		for(Poketmon p: arryPoketmon) {
			System.out.println(dao.insertPoketmon(p));
		}
	}

	public void getWikidata(String name) {
		poketmon = new Poketmon();
		String url = "http://ko.pokemon.wikia.com/wiki/" + name;
		Connection con = Jsoup.connect(url);
		ArrayList<String> list = new ArrayList<>();
		Elements els = null;
		int count = 0;
		int tmp = 99999;
		boolean flag = true;
		
		try {
			Document doc = con.get();
			els = doc.select("table.body tbody tr td");
			els.size();
			System.out.print(doc.selectFirst("strong.rounded").text()+ " ");
			System.out.print(doc.selectFirst(".name-ko strong").text()+ " ");
			System.out.println(doc.selectFirst(".name-ja span").text());
			
			for (Element ee : els) {
				if(flag)
					if(ee.text().contains("m")) {
						tmp=count-1;
						flag = false;
					}
				if((count<=4)||(count>tmp&&count<tmp+5)) {
				list.add(ee.text());
//				System.out.println(ee.text()+" "+" 번호:"+count);
				}
				if(flag)
				if(ee.text().equals("70")) {
						tmp=count;
						flag = false;
				}
				
				count++;
			}
			
			poketmon.setNo(doc.selectFirst("strong.rounded").text());
			poketmon.setKor_name(doc.selectFirst(".name-ko strong").text());
			poketmon.setJap_name(doc.selectFirst(".name-ja span").text());
			poketmon.setType(list.get(0));
			poketmon.setSort(list.get(1));
			poketmon.setCharacter(list.get(2));
			poketmon.setH_character(list.get(3));
			poketmon.setE_point(list.get(4));
			poketmon.setHeight(list.get(5));
			poketmon.setWeight(list.get(6));
			try {
				poketmon.setC_rate(Integer.parseInt((list.get(7))));
			} catch (NumberFormatException e) {
				poketmon.setC_rate(0); //전설의 포켓몬
			}
			
			poketmon.setG_rate(list.get(8));
//			System.out.println(poketmon.toString());
			arryPoketmon.add(poketmon);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
	}
	public void getWikiPhoto(String name) { 
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		String initUrl = "http://ko.pokemon.wikia.com/wiki/"+name;
		String imgUrl = null;
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		try {
			Document doc = con.get();
			els = doc.select("div.image.rounded a img");
			for(Element e : els) {
//			System.out.println(e.attr("src"));
			imgUrl =e.attr("src");
			}
			
			URL url=new URL(imgUrl);
			
			InputStream is = url.openStream();
		    File file = new File("images\\"+name+".png");
		    OutputStream os = new FileOutputStream(file);

		    byte[] b = new byte[2048];
		    int length =0;

		    while ((length = is.read(b)) != -1) {
		        os.write(b, 0, length);
		    }

		    is.close();
		    os.close();
			
			  
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
	}
}


