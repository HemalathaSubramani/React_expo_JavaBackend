package com.erp.test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.CIRTPrintOrder;

@Repository
public interface CIRTPrintOrderRepository  extends JpaRepository<CIRTPrintOrder, String>{
	
	@Query("Select p.tporcopiestotal, p.tporpostertotal FROM  CIRTPrintOrder p WHERE p.tpordate = :Date")
	List<Object[]> findSelectedFieldsByTPORDATE(@Param("Date") Date date);

}
