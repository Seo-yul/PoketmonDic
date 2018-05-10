package poketmon.ui;

import java.io.IOException;
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
	private Poketmon poketmon= null;
	public static void main(String[] args) {
		PoketmonUI ui = new PoketmonUI();
		ui.crawl();
	}
	public void crawl() {
		poketmon = new Poketmon();
		String name = null;
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		String url = "http://ko.pokemon.wikia.com/wiki/"+name;
			Connection con = Jsoup.connect(url);
			ArrayList<String> list = new ArrayList<>();
			
			Elements els = null;
			int count = 0;
			
			String ko_name = null; //한국이름
			String jp_name = null; //일본이름
			String number = null; //번호
			String type = null; //타입
			String sort = null; //분류
			String spec = null; //특성
			String hspec = null; //숨겨진 특성
			String exp = null; //경험치
			String tall = null; //키
			String weight = null; //몸무게
			String crate = null; //포획률
			String grate = null; //몸무게
			
			try {
				Document doc = con.get();
				els = doc.select("table tbody tr td");
				for(Element ee : els) {
					list.add(ee.text());
					count++;
					if(count==29)break;
				}
				
				poketmon.setKo_name(doc.selectFirst(".name-ko strong").text());
				poketmon.setJp_name(doc.selectFirst(".name-ja span").text());
				poketmon.setNumber(doc.selectFirst("strong.rounded").text());
				poketmon.setType(list.get(10));
				poketmon.setSort(list.get(11));
				poketmon.setSpec(list.get(12));
				poketmon.setHspec(list.get(13));
				poketmon.setExp(list.get(14));
				poketmon.setTall(list.get(25));
				poketmon.setTall(list.get(26));
				poketmon.setWeight(list.get(26));
				poketmon.setCrate(list.get(27));
				poketmon.setGrate(list.get(28));
				
				System.out.println(poketmon.toString());
				dao.insertPoketmon(poketmon);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
