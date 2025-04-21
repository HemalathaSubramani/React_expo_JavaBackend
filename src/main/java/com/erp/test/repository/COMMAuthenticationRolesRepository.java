package com.erp.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.erp.test.model.COMMAuthenticationRoles;
import com.erp.test.model.COMMAuthenticationRolesId;

@Repository
public interface COMMAuthenticationRolesRepository extends JpaRepository<COMMAuthenticationRoles,COMMAuthenticationRolesId>{
	 @Query("SELECT c.id.maurusername, c.commroleByMaurrolid FROM COMMAuthenticationRoles c WHERE c.id.maurusername = :username")
	    List<Object[]> findUserRolesByUsername(@Param("username") String username);
	
}
