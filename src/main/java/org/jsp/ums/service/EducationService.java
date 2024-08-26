package org.jsp.ums.service;

import org.jsp.ums.entity.Education;
import org.springframework.http.ResponseEntity;

public interface EducationService {

	ResponseEntity<?> saveEducation(Education education);

}
