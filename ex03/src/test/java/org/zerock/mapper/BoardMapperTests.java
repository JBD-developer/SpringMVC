package org.zerock.mapper;

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
public class BoardMapperTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	@Test 
	public void testInsert() {
//		BoardVO boardVO = new BoardVO();
//		
//		boardVO.setTitle("new test Title2");
//		boardVO.setContent("new test Content2");
//		boardVO.setWriter("User06");
//		mapper.insert(boardVO);
//		
//		log.info(boardVO);
	}
	@Test
	public void testInsertSelectKey() {
//		BoardVO boardVO = new BoardVO();
//		boardVO.setTitle("new Select Key Title2");
//		boardVO.setContent("new SelectKey Content2");
//		boardVO.setWriter("User07");
//		
//		mapper.insertSelectKey(boardVO);
//		
//		log.info(boardVO);
	}
	@Test
	public void testRead() {
		
		BoardVO boardVO = mapper.basicSelect(4L);
		log.info(boardVO);
	}
	
	@Test
	public void testDelete() {
//		log.info("DELETE COUNT : " + mapper.delete(6L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO boardVO = new BoardVO();
		boardVO.setBno(5L);
		boardVO.setTitle("Update Title");
		boardVO.setContent("Update Content");
		boardVO.setWriter("User05");
		
		int count = mapper.update(boardVO);
		log.info("UPDATE COUNT :" + count);
	}
}
