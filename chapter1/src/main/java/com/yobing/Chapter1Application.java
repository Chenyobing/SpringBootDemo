package com.yobing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 这里使用@SpringBootApplication指定这是一个spring boot的应用程序
 * SpringBoot的启动类最好是放在root package下，因为默认不指定basePackages
 * @Author : yobing Chen
 * @Data : 2017/3/28
 */
@SpringBootApplication
public class Chapter1Application {
	//在main方法进行启动我们的应用程序
	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}
