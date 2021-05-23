package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

import lombok.Data;

public interface BoardMapper {

	//@Select("SELECT * FROM tbl_board bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO basicSelect(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO boardVO);
}
