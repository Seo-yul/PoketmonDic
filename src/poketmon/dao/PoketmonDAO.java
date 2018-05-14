package poketmon.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import poketmon.vo.Poketmon;

public class PoketmonDAO {
	private SqlSessionFactory factory = MybatisConfig.getResourceAsReader();
	
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
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
	
	public Poketmon findPoketmon(String name) {
		SqlSession session = null;
		Poketmon p = null;
		
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			p = mapper.findPoketmon(name);
			
		} catch (Exception e) {
			e.printStackTrace();
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
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
	// 파라미터 수정
	public boolean deletePoketmon(String no) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			cnt = mapper.deletePoketmon(no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		
		if (cnt > 0) {
			result = true;
		}
		return result;
	}
}
