package com.cursospring.jdbc.academia.mysql;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cursospring.jdbc.academia.mysql.dao.impl.CursoDAOImpl;

@SpringBootApplication
public class CursoSpringJdbcAcademiaApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CursoDAOImpl cursoDaoImpl = context.getBean("cursoDAOImpl", CursoDAOImpl.class);
		cursoDaoImpl.createCurso();
		context.close();
	}

}
