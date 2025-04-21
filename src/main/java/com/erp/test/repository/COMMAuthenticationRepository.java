package com.erp.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.test.model.COMMAuthentication;

@Repository
public interface COMMAuthenticationRepository extends JpaRepository <COMMAuthentication, String>{
	
	COMMAuthentication findByMautUsernameIgnoreCase(String username);
}
