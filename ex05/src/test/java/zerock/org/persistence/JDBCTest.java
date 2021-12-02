package zerock.org.persistence;
import static  org.junit.Assert.fail;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	static {
	
		try {
			Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy"); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testConnction() {
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE",
				"scott",
				"1234")){
			log.info(con);
			
		} catch (Exception ex) {
			fail(ex.getMessage());
		}
	}
}
