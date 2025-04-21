package com.erp.test.service;

import com.erp.test.model.COMMAuthentication;
import com.erp.test.repository.COMMAuthenticationRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class COMMAuthenticationService {

    @Autowired
    private COMMAuthenticationRepository comrepo;

    public String getAuthenticatedUser(String username, String password) {
        COMMAuthentication user = comrepo.findByMautUsernameIgnoreCase(username);
        if (user != null) {
            if (user.getMautPassword().equalsIgnoreCase(password)) {
//                if (user.getCommRoleByMautRoleId().getMrolid().equalsIgnoreCase(role)) {
                    return "login successful";
                } else {
                    return "Incorrect role";
                }
            } else {
                return "Incorrect password";
            }
//        } else {
//            return "Incorrect username";
        }
    

    public List<COMMAuthentication> getAllAgents() {
        return comrepo.findAll();
    }
}
