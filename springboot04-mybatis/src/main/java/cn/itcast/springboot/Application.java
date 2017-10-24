package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年10月22日 上午11:23:42
 * @version 1.0
 */
@SpringBootApplication(scanBasePackages={"cn.itcast.springboot"})
public class Application {

	public static void main(String[] args) {
		/** 运行SpringBoot的应用 (第二种方式) 去掉Banner */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置Banner横幅为关闭 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}