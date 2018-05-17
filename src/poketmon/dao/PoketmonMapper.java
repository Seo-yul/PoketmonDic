package poketmon.dao;

import java.util.ArrayList;

import poketmon.vo.Manager;
import poketmon.vo.Poketmon;

public interface PoketmonMapper {
	public int insertPoketmon(Poketmon p);
	public int updatePoketmon(Poketmon p);
	public int deletePoketmon(String ko_name);
	public Poketmon findPoketmon(String ko_name);
	public Poketmon findPoketmon2(String jap_name);
	public void getWikiPhoto(String name);
	public boolean getWikidata(String name);
	public Manager checkPassword(String name);
	public ArrayList<Poketmon> selectAll();
	}
