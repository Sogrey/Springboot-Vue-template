package top.sogrey.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication // Spring Boot项目的核心注解，主要目的是开启自动配置
public class SpringbootMainApplication {

	// 在main方法中启动一个应用，即：这个应用的入口
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMainApplication.class, args);
//		SpringApplication app = new SpringApplication(SpringbootMainApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);// 关闭banner
//		app.run(args);
	}
}
