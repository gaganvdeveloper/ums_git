package org.jsp.ums.daoimpl;

import java.util.Optional;

import org.jsp.ums.dao.EducationDao;
import org.jsp.ums.entity.Education;
import org.jsp.ums.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EducationDaoImpl implements EducationDao{
	@Autowired
    EducationRepository educationRepository;

	@Override
	public void educationDeleteById(int id) {
		educationRepository.deleteById(id);
		
	}

	@Override
	public Optional<Education> findEducationById(int id) {
		return educationRepository.findById(id);
	}



}
