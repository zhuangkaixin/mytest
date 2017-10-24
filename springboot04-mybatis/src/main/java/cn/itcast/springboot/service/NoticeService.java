package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.domain.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午12:32:31
 * @version 1.0
 */
public interface NoticeService {

	List<Notice> findAll();
	
	/** 分页查询公告 */
	Map<String, Object> findByPage(Integer page, Integer rows);

}
