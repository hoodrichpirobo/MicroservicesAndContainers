package com.in28minutes.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.*;
import com.in28minutes.springboot.learnjpaandhibernate.course.*;
import jakarta.persistence.*;
import jakarta.transaction.*;

@Repository
@Transactional
public class CourseJpaRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
