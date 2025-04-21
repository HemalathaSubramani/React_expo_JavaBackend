package com.erp.test.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.FACHTJournalHeader;

@Repository
public interface FACTJournalHeaderRepository extends JpaRepository<FACHTJournalHeader, String>{
	
	@Query("select sum(D.id.tjoddbamt) DEBITAMOUNT, SUM(D.id.tjodcramt) CREDITAMOUNT,  L.mldgcbg from FACMLedger L,FACHTJournalHeader H,FACHTJournalDetail D "+
	" where L.mldgid = D.facmledger.mldgid AND H.id.tjohno = D.id.tjodjohno AND L.mldgcbg IN ('C', 'B')"+
	" AND D.id.tjodstatus in('A','a') AND H.id.tjohdate= :date GROUP BY L.mldgcbg")
	List<Object[]> getDebitAndCreditAmount(@Param("date") Date date);

}
