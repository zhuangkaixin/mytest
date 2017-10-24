package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.domain.Notice;

/**
 * NoticeMapper
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午12:32:17
 * @version 1.0
 */
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice order by id asc")
	List<Notice> findAll();

	/** 统计查询 */
	long count();
	
	/** 分页查询 */
	List<Notice> findByPage(@Param("a")Integer page,
			@Param("b")Integer rows);

}
