package com.erp.test.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.HRMTPayfile;

@Repository
public interface HRMTPayFileRepository extends JpaRepository<HRMTPayfile,Integer>{
	
	@Query("SELECT SUM(p.id.tpaynetamount) FROM HRMTPayfile p " +
		       "WHERE FUNCTION('YEAR', p.id.tpaymonthyear) = FUNCTION('YEAR', :date) " +
		       "AND FUNCTION('MONTH', p.id.tpaymonthyear) = FUNCTION('MONTH', :date)")
	Long getPayByMonthWise(@Param("date") Date date );
}
