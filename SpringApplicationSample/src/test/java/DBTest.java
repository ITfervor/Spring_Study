import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DBTest {
	@Autowired
	private DataSource ds;
		
	@Test
	public void testDataSourceConection()throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

