import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import di.controller.MemberController;
import di.domain.Good;
import di.persistence.GoodMapper;
import di.persistence.GoodRepository;
import di.persistence.HibernateRepository;
import di.persistence.TransactionRepository;

public class DiMain {

	public static void main(String[] args) {
		try(GenericXmlApplicationContext context = 
			new GenericXmlApplicationContext(
				"applicationContext.xml")) {
			HibernateRepository repository = 
					context.getBean(HibernateRepository.class);
			
			System.out.println(repository.getGood(1));
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}