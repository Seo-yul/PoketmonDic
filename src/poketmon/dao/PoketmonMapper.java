package poketmon.dao;

import poketmon.vo.Poketmon;

public interface PoketmonMapper {
	public int insertPoketmon(Poketmon p);
	public int insertDetail(Poketmon p);
	public int insertBasic_Info(Poketmon p);
	public int updatePoketmon(Poketmon p);
	public int deletePoketmon(Poketmon p);
	public Poketmon findPoketmon(String ko_name);
	}
