package org.jsp.ums.serviceimpl;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.responsestructure.ResponseStructure;
import org.jsp.ums.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService{
	
	@Autowired
	private EducationDao educationDao;

	@Override
	public ResponseEntity<?> saveEducation(Education education) {
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value())
				.message("Education Created Successfully...").body(educationDao.saveEducation(education)).build());
	}

}
