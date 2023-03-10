package di.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import di.domain.Good;

//@Repository
public class GoodRepository {
	//@Autowired
	private SqlSession sqlSession;
	
	public int insertGood(Good good) {
		//삽입을 제외한 모든 메서드는 리턴 타입은 int
		return sqlSession.insert("insertGood", good);
	}
	
	public List<Good> allGood(){
		return sqlSession.selectList("allGood");
	}
	
	public Good getGood(int code) {
		return sqlSession.selectOne("getGood", code);
	}
}





