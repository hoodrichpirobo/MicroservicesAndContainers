package com.in28minutes.springboot.learnspringboot;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveallCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn DevOps", "in28minutes"),
				new Course(3, "Learn Azure", "in28minutes"),
				new Course(4, "Learn GCP", "in28minutes")
				);
	}
}
