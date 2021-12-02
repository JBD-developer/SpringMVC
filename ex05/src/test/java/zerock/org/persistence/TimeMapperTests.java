package zerock.org.persistence;
import static org.junit.Assert.fail; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import zerock.org.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {

	@Setter(onMethod_ = {@Autowired})
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		 try { 
			log.info(timeMapper.getClass().getName());
			log.info(timeMapper.getTime());
		} catch (Exception ex) {
			fail(ex.getMessage());
		}
	}
	@Test
	public void testGetTime2() {
		try {
			log.info(timeMapper.getTime2());
		} catch (Exception ex) {
			fail(ex.getMessage());	
		}
	}
}
