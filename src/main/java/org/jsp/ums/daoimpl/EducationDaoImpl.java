package org.jsp.ums.daoimpl;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EducationDaoImpl implements EducationDao{
	
	@Autowired
	private EducationRepository educationRepository;

	@Override
	public Education saveEducation(Education education) {
		return educationRepository.save(education);
	}

}
