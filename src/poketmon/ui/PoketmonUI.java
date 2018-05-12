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
	private Poketmon poketmon = null;
	private ArrayList<Poketmon> arryPoketmon = new ArrayList<>();
	public static void main(String[] args) {
		PoketmonUI ui = new PoketmonUI();
		ui.init();
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
			dao.insertPoketmon(p);
		}
	}

	public void getWikidata(String name) {
		poketmon = new Poketmon();
		String url = "http://ko.pokemon.wikia.com/wiki/" + name;
		Connection con = Jsoup.connect(url);
		ArrayList<String> list = new ArrayList<>();
		Elements els = null;
		int count = 0;

		try {
			Document doc = con.get();
			els = doc.select("table tbody tr td");
			for (Element ee : els) {
				list.add(ee.text());
				count++;
				if (count == 29)
					break;
			}

			poketmon.setNo(doc.selectFirst("strong.rounded").text());
			poketmon.setKor_name(doc.selectFirst(".name-ko strong").text());
			poketmon.setJap_name(doc.selectFirst(".name-ja span").text());
			poketmon.setType(list.get(10));
			poketmon.setSort(list.get(11));
			poketmon.setCharacter(list.get(12));
			poketmon.setH_character(list.get(13));
			poketmon.setE_point(list.get(14));
			poketmon.setHeight(list.get(25));
			poketmon.setWeight(list.get(26));
			poketmon.setC_rate(Integer.parseInt(list.get(27)));
			poketmon.setG_rate(list.get(28));
			System.out.println(poketmon.toString());
			arryPoketmon.add(poketmon);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//
		}
	}
}
