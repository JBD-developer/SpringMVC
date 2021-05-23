package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardService boardService;
	
	@Test
	public void testExist() {
		log.info(boardService);
		assertNotNull(boardService);
	}
	@Test
	public void testRegister() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setTitle("new service Title");
//		boardVO.setContent("new service content");
//		boardVO.setWriter("User07");
//		
//		boardService.register(boardVO);
//		log.info(boardVO);
	}
	@Test
	public void testGetList(){
		boardService.getList().forEach(boardVO -> log.info(boardVO));
	}
	
	@Test
	public void testGet() {
//		boardService.get(4L);
//		log.info(boardService.get(4L));
	}
	
	@Test
	public void testModify() {
//		BoardVO boardVO = boardService.get(8L);
//		
//		if (boardVO == null) {
//			
//			return;
//			
//		}
//		boardVO.setWriter("User08");
		
	}
	@Test
	public void testRemove() {
//		log.info("Remoce Result : " + boardService.remove(8L));
	}
}
