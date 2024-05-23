package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import com.in28minutes.springboot.learnjpaandhibernate.course.*;

@Repository
public class CourseJdbcRepository {
	@Autowired 
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY =
			"""
				insert into course (id, name, author)
				values(?, ?, ?);				
			""";
	private static String DELETE_QUERY =
			"""
				delete from course
				where id = ?
			""";
	private static String SELECT_QUERY =
			"""
				select * from course
				where id = ?
			""";
	
	public Course findById(long id) {
		//ResultSet -> Bean => Row Mapper =>
		return springJdbcTemplate.queryForObject(SELECT_QUERY, 
				new BeanPropertyRowMapper<>(Course.class), id);
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY,id);
	}
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY,
				course.getId(), course.getName(), course.getAuthor());
	}
}
