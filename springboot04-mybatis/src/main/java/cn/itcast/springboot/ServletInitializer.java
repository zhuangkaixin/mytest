package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * SpringBoot的web应用入口(启动类)
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 下午5:02:21
 * @version 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		System.out.println("===ServletInitializer====");
		/** 设置引导类 */
		builder.sources(Application.class);
		/** 设置Banner横幅为关闭 */
		builder.bannerMode(Mode.OFF);
		return builder;
	}
}