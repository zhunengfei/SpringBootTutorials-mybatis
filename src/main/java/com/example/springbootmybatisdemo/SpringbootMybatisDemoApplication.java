package com.example.springbootmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.springbootmybatisdemo.mapper")//将项目中对应的mapper类的路径加进来就可以了
@ComponentScan
public class SpringbootMybatisDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
  }
}
