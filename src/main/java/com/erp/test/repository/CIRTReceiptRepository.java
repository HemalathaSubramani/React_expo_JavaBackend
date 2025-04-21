package com.erp.test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.CIRTReceipt;

@Repository
public interface CIRTReceiptRepository extends JpaRepository<CIRTReceipt, String>{
	
	@Query("SELECT SUM(c.trecAmount),c.commPaymode.mpampaymode FROM CIRTReceipt c WHERE c.trecPayDate = :date GROUP BY c.commPaymode.mpampaymode")
	List<Object[]> findSelectedFieldsByTrecPayDate(@Param("date") Date date);

}
