package org.jsp.ums.dao;

import java.util.Optional;

import org.jsp.ums.entity.Education;

public interface EducationDao {

	 void educationDeleteById(int id);

	Optional<Education> findEducationById(int id);

}
