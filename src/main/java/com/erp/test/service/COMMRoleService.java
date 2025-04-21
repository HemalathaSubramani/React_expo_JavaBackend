package com.erp.test.service;

import java.util.List;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.model.COMMRole;
import com.erp.test.repository.COMMAuthenticationRolesRepository;

import jakarta.transaction.Transactional;

@Service
public class COMMRoleService {

    @Autowired
    private COMMAuthenticationRolesRepository commauthrolerepo;

    @Transactional
    public List<String> getRolesByUsername(String username) {

        // Fetch user roles using the simplified query
        List<Object[]> userRoles = commauthrolerepo.findUserRolesByUsername(username);

        // If roles are found, extract the role names and return
        if (userRoles != null && !userRoles.isEmpty()) {
            List<String> roles = new LinkedList<>();  // Initialize the list to store roles

            // Loop through the fetched roles and extract the role names
            for (Object[] role : userRoles) {
                // Get the role from the array (role[1] contains the COMMRole)
                COMMRole commRole = (COMMRole) role[1];
                if (commRole != null) {
                    String mrolid = commRole.getMrolid();  // Extract the role ID
                    if (mrolid != null) {
                        roles.add(mrolid);  // Add the role to the list if not null
                    }
                }
            }

            return roles;
        }

        // Return an empty list if no roles found
        return new LinkedList<>();  // Return an empty list if no roles found
    }
}
