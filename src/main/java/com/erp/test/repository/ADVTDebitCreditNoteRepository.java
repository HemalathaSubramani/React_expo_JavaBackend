package com.erp.test.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.ADVTDebitCreditNotes;
import com.erp.test.model.ADVTDebitCreditNotesId;

@Repository
public interface ADVTDebitCreditNoteRepository  extends JpaRepository<ADVTDebitCreditNotes, ADVTDebitCreditNotesId>{
	
	@Query("Select SUM(a.id.tdceamount) FROM  ADVTDebitCreditNotes a WHERE a.id.tdcetypedebitcredit='C' AND a.id.tdcedate= :date ")
	Long getCreditAmountByMonth(@Param ("date") Date date);

}
