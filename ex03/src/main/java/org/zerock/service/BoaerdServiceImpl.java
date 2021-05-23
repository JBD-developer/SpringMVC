package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor

public class BoaerdServiceImpl implements BoardService{

	@Setter(onMethod_ = {@Autowired})
	private BoardMapper boardMapper;
	
	@Override
	public void register(BoardVO boardVO) {
		// TODO Auto-generated method stub
		boardMapper.insert(boardVO);
		log.info("register : " + boardVO);
	}

	@Override
	public boolean modify(BoardVO boardVO) {
		// TODO Auto-generated method stub
		log.info("modify : " + boardVO);
		return boardMapper.update(boardVO) == 1;
	}

	@Override
	public BoardVO get(long bno) {
		// TODO Auto-generated method stub
		log.info("get : " + bno);
		return boardMapper.basicSelect(bno);
	}

	@Override
	public boolean remove(long bno) {
		// TODO Auto-generated method stub
		log.info("remove : " + bno);
		return boardMapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("getLost : ");
		return boardMapper.getList();
	}

}
