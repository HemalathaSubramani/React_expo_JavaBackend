package com.erp.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.test.model.COMMRole;

@Repository
public interface COMMRoleRepository extends JpaRepository<COMMRole, String>{
	 List<COMMRole> findByMrolidIn(List<String> roleIds); 
}
