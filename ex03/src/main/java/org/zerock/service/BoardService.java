package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {

	public void register (BoardVO boardVO);
	
	public boolean modify(BoardVO boardVO);

	public BoardVO get(long bno);
	
	public boolean remoce(long bno);
	
	public List<BoardVO> getList();
}
