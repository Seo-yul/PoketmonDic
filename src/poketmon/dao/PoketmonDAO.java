package poketmon.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import poketmon.vo.Poketmon;

public class PoketmonDAO {
	private SqlSessionFactory factory = MybatisConfig.getResourceAsReader();

	public boolean insertPoketmon(Poketmon p) {
		boolean result = false;
		SqlSession session = null;

		try {
			session = factory.openSession();
			PoketmonMapper mapper = session.getMapper(PoketmonMapper.class);
			if (mapper.insertPoketmon(p) > 0)
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.commit();
				session.close();
			}
		}
		return result;
	}

	public boolean updatePoketmon(Poketmon p) {
		boolean result = false;

		return result;
	}

	public boolean deletePoketmon(Poketmon p) {
		boolean result = false;

		return result;
	}

	public Poketmon findPoketmon(String ko_name) {
		Poketmon p = null;

		return p;
	}

}
