package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class BoaerdServiceImpl implements BoardService{

	@Setter(onMethod_ = {@Autowired})
	private BoardMapper boardMapper;
	
	@Override
	public void register(BoardVO boardVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean modify(BoardVO boardVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardVO get(long bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remoce(long bno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
