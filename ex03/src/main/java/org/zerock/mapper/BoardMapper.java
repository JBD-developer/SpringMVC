package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

import lombok.Data;

public interface BoardMapper {

	@Select("SELECT * FROM tbl_board")
	public void getList();
}
