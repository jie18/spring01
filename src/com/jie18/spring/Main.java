package com.jie18.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		
	/*	
		//创建HelloWorld的一个对象
		HelloWorld helloworld = new HelloWorld();
		//为name属性赋值
		helloworld.setName2("jie18");
		//可以用spring代替这两步
	*/
		//1.创建Spring的IOC容器对象
		//ApplicationContext 代表IOC容器
		//ClassPathXmlApplicationContext是ApplicationContext接口的一个实现类，该类从类路径下加载配置文件.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC容器中获取bean实例
		//用id定位到IOC容器中的bean
		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");
		//利用类型返回IOC 容器中的Bean，但要求IOC容器中只能有一个该类型的Bean
//		HelloWorld helloworld = ctx.getBean(HelloWorld.class); 
		//调用hello方法
		helloworld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		  
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
		
	}

}
