package com.spr1;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import com.spr1.Student;
import com.spr1.StudentDAO;
import com.spr1.Empp;
import com.spr1.EmppDAO;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ContextApplication.xml");
		
		Student st=(Student) ac.getBean("std");
		StudentDAO std=(StudentDAO) ac.getBean("stdao1");
		std.savePS(st);
		System.out.println("Congratulation!! Your Name is: " + st.getName() + " And You are a Student");
		
		Empp st1=(Empp) ac.getBean("emp");
		EmppDAO std1=(EmppDAO) ac.getBean("emdao1");
		std1.savePS(st1);
		System.out.println("Congratulation!! Your Name is : " + st1.getName()+ " And You are an Employee" );


	}

}
