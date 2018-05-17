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
	public static void main(String[] args) {
		PoketmonUI ui = new PoketmonUI();
		ui.init();
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
	public ArrayList<String> init() {
		String initUrl = "http://ko.pokemon.wikia.com/wiki/%EA%B5%AD%EA%B0%80%EB%B3%84_%ED%8F%AC%EC%BC%93%EB%AA%AC_%EC%9D%B4%EB%A6%84_%EB%AA%A9%EB%A1%9D";
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		ArrayList<String> arr = new ArrayList<>();
		int count = 0;
		try {
			Document doc = con.get();
			els = doc.select("a.mw-redirect");
			for (Element ee : els) {
				arr.add(ee.text());
				count ++;
				if(count==807)break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
		return arr;
	}

	
	
}


