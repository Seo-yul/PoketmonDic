package poketmon.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import poketmon.vo.Manager;
import poketmon.vo.Poketmon;

public class PoketmonDAO {
	private SqlSessionFactory factory = MybatisConfig.getResourceAsReader();
	private Poketmon poketmon = null;
	private Manager m = null;
	private ArrayList<Poketmon> arrP = null;
	
	public void getWikiPhoto(String name) { 
		String initUrl = "http://ko.pokemon.wikia.com/wiki/"+name+"_(포켓몬)";
		String imgUrl = null;
		Connection con = Jsoup.connect(initUrl);
		Elements els = null;
		int i = 0;
		
		try {
			File file = new File("images\\"+name+".png");
		    if(!file.exists()) {
			Document doc = con.get();
			els = doc.select("div.image.rounded a img");
			for(Element e : els) {
//			System.out.println(e.attr("src"));
			imgUrl =e.attr("src");
			i++;
			if(i>1)break;
			}
			
			URL url=new URL(imgUrl);
			
			InputStream is = url.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
		    
		    	OutputStream os = new FileOutputStream(file);
			    BufferedOutputStream bos = new BufferedOutputStream(os);

			    byte[] b = new byte[61440];
			    int length =0;

			    while ((length = bis.read(b)) != -1) {
			        bos.write(b, 0, length);
			    }
			    bos.close();
			    os.close();
			    bis.close();
			    is.close();
		    }
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			//
		}
	}
	
	public boolean getWikidata(String name) {
		boolean result = false;
		poketmon = new Poketmon();
		String url = "http://ko.pokemon.wikia.com/wiki/" + name + "_(포켓몬)";
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
			System.out.print(doc.selectFirst(".name-ja span").text());
			System.out.println(" 정보 다운");
			for (Element ee : els) {
				if(flag)
					if(ee.text().contains("m")) {
						tmp=count-1;
						flag = false;
					}
				if((count<=4)||(count>tmp&&count<tmp+5)) {
				list.add(ee.text());
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
			for(int i=0; i<list.size();i++) {
				if(list.get(i).length()<1)
					list.set(i, "알려지지않음");
			}
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
			result=this.insertPoketmon(poketmon);
		} catch (Exception e) {
			System.out.println("위키겟실패");
			return false;
		} finally {
			//
		}
		return result;
	}
	
	public boolean insertPoketmon(Poketmon poketmon) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			cnt = mapper.insertPoketmon(poketmon);
			session.commit();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("인설트실패");
			return false;
		} finally {
			if (session != null) session.close();
		}
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
	
	public Poketmon findPoketmon(String kor_name) {
		SqlSession session = null;
		Poketmon p = null;
		
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			p = mapper.findPoketmon(kor_name);
			
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		return p;
	}
	public Poketmon findPoketmon2(String jap_name) {
		SqlSession session = null;
		Poketmon p = null;
		
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			p = mapper.findPoketmon2(jap_name);
			
		} catch (Exception e) {
//			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		return p;
	}
	
	public boolean updatePoketmon(Poketmon poketmon) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			cnt = mapper.updatePoketmon(poketmon);
			session.commit();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("업데이트실패");
			return false;
		} finally {
			if (session != null) session.close();
		}
		
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
	// 파라미터 수정
	public boolean deletePoketmon(String kor_name) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			cnt = mapper.deletePoketmon(kor_name);
			session.commit();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("삭제실패");
			return false;
		} finally {
			if (session != null) session.close();
		}
		
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
	
	public Manager checkPassword(String name) {
		SqlSession session = null;
		m = null;
		
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			m = mapper.checkPassword(name);
		} catch (Exception e) {
			//e.printStackTrace();
			if (m == null) {
				return null;
			}
		} finally {
			if (session != null) session.close();
		}
		
		return m;
	}
	
	public ArrayList<Poketmon> selectAll() {
		SqlSession session = null;
		arrP = new ArrayList<>();
		
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			arrP = mapper.selectAll();
			
		} catch (Exception e) {
			//e.printStackTrace();
			if (arrP == null) {
				return null;
			}
		} finally {
			if (session != null) session.close();
		}
		
		return arrP;
	}
	
	
}
