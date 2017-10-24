package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.domain.Notice;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午12:32:50
 * @version 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	/** 分页查询公告 */
	public Map<String, Object> findByPage(Integer page, Integer rows){
		
		Map<String, Object> data = new HashMap<>();
		/** {"total" : 1000, "rows" : [{},{}]} */
		/** 统计查询 */
		long count = noticeMapper.count();
		data.put("total", count);
		
		/** 分页查询 */
		List<Notice> notices = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", notices);
		return data;
	}
}
