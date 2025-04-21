package com.erp.test.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.HRMTLeaveCreation;

@Repository
public interface HRMLeaveCreationRepository extends JpaRepository<HRMTLeaveCreation, String>{
	@Query("SELECT COUNT(h) FROM HRMTLeaveCreation h WHERE :date Between h.tlcrfromdate AND h.tlcrtodate AND h.tlcrstatus = 'A'")
	Long countAbsenceByDate(@Param("date") Date date);
}
