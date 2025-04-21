package com.erp.test.repository;


import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.FACTLedgerOpeningBalnceId;
import com.erp.test.model.FACTOpeningBalance;

@Repository
public interface FACTJournalDetailRepository extends JpaRepository<FACTOpeningBalance, FACTLedgerOpeningBalnceId> {

	    @Query("Select l.id.mldgname, SUM(l.id.db) - SUM(l.id.cr) from FACHVLedger l, FACMFinancialYear fy where "
	    		+ "l.id.yr = fy.mfyrid and l.id.cbg in ('C','B') and :endDate between fy.mfyrsdate and fy.mfyredate "
	    		+ "and l.id.vdate <= :endDate group by l.id.mldgname")
	    List<Object[]> getJournalDailyAmounts(@Param("endDate") Date endDate);
	    
}

