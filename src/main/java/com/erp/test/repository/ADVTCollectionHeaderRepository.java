package com.erp.test.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.ADVTCollectionHeader;

@Repository
public interface ADVTCollectionHeaderRepository extends JpaRepository<ADVTCollectionHeader, String>{
	
	@Query("Select SUM(tcohamount) FROM ADVTCollectionHeader WHERE tcohpaydate = :date ")
	Long getTotalAmount(@Param ("date") Date date);
	
}
