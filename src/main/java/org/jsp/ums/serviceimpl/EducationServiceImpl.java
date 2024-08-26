package org.jsp.ums.serviceimpl;

import java.util.Optional;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.exceptionclasses.InvalidEducationIdException;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.jsp.ums.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class EducationServiceImpl implements EducationService{
	@Autowired
       EducationDao educationDao;
	@Override
	public ResponseEntity<?> educationDeleteById(int id) {
		    Optional<Education> education = educationDao.findEducationById(id);
		    if(education.isEmpty()) {
		    	throw  InvalidEducationIdException.builder().build();
		    }
		   educationDao.educationDeleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).message("delete successfully..!").body(education.get()).build());
	}
       
}
