package poketmon.ui;

import java.io.IOException;
import java.util.ArrayList;

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
		ui.init();
//		ui.getWikidata("피카츄");
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
}
