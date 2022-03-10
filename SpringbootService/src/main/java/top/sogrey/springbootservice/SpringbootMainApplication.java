package top.sogrey.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication // Spring Boot��Ŀ�ĺ���ע�⣬��ҪĿ���ǿ����Զ�����
public class SpringbootMainApplication {

	// ��main����������һ��Ӧ�ã��������Ӧ�õ����
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMainApplication.class, args);
	}
}
