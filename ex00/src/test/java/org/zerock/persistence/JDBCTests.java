package org.zerock.persistence;
import static org.junit.Assert.fail;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class JDBCTests {
//
//	static {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver"); 
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	static {
		try {
			Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy"); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
//	public void testConnetion() {
//		try (Connection con = 
//				DriverManager.getConnection(
//						"jdbc:oracle:thin:@localhost:1521:XE",
//						"scott",
//						"tiger")){
//			log.info(con);
//		} catch (Exception e) {
//			fail(e.getMessage());
//		}
//	}
	
	public void testConnetion() {
		try (Connection con = 
				DriverManager.getConnection(
						"jdbc:log4jdbc:oracle:thin:@localhost:1521:XE",
						"scott",
						"tiger")){
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
