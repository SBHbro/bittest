package com.bit.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.bit.dto.PostDto;

public interface PostMapper {

	@Select("select * from testpage ORDER BY date DESC")
	public List<PostDto> getList();
}
