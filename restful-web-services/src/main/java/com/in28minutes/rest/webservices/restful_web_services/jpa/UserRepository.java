package com.in28minutes.rest.webservices.restful_web_services.jpa;

import org.springframework.data.jpa.repository.*;
import com.in28minutes.rest.webservices.restful_web_services.user.*;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
