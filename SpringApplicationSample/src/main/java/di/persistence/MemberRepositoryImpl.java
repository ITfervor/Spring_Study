package di.persistence;

import org.springframework.stereotype.Repository;

import di.entity.MemberEntity;

//bean을 자동 생성해주는 어노테이션
@Repository
public class MemberRepositoryImpl implements MemberRepository {

	@Override
	public MemberEntity findById(String id) {
		MemberEntity memberEntity = 
				MemberEntity.builder()
					.id("adam")
					.password("1234")
					.nickname("군계")
					.build();
		return memberEntity;
	}

}
