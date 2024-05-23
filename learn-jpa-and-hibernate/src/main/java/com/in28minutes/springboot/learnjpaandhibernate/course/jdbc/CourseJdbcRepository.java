package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = """
				INSERT INTO COURSE(ID, NAME, AUTHOR)
				VALUES(1,'LEARN AWS', 'IN28MINUTES');

			""";

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
