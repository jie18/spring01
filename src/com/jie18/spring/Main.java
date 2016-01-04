package com.jie18.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		
	/*	
		//����HelloWorld��һ������
		HelloWorld helloworld = new HelloWorld();
		//Ϊname���Ը�ֵ
		helloworld.setName2("jie18");
		//������spring����������
	*/
		//1.����Spring��IOC��������
		//ApplicationContext ����IOC����
		//ClassPathXmlApplicationContext��ApplicationContext�ӿڵ�һ��ʵ���࣬�������·���¼��������ļ�.
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC�����л�ȡbeanʵ��
		//��id��λ��IOC�����е�bean
		HelloWorld helloworld = (HelloWorld) ctx.getBean("helloWorld");
		//�������ͷ���IOC �����е�Bean����Ҫ��IOC������ֻ����һ�������͵�Bean
//		HelloWorld helloworld = ctx.getBean(HelloWorld.class); 
		//����hello����
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
