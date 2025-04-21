package com.erp.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.test.Dto.LoginRequestDto;
import com.erp.test.service.COMMAuthenticationService;
import com.erp.test.service.COMMRoleService;

@RestController
@RequestMapping("/user")
public class COMMAuthenticationController {
	
	@Autowired
	private COMMAuthenticationService comserv;
	@Autowired
	private COMMRoleService commroleserv;
	
	@GetMapping("/role/{username}")
    public ResponseEntity<List<String>> getRolesByUsername(@PathVariable String username) {
        List<String> roles = commroleserv.getRolesByUsername(username);

        // If roles are found, return them; otherwise, return a not found status
        if (roles != null && !roles.isEmpty()) {
            return ResponseEntity.ok(roles);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
	@CrossOrigin(origins = "http://192.168.10.71:8083")
	@RequestMapping(value = "/login", method = RequestMethod.OPTIONS)
	public ResponseEntity<Void> handleOptions() {
	    return ResponseEntity.ok().build();
	}
	
//	
	@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDto loginRequest) {
        // Get username, password, and role from the request body
        String username = loginRequest.getMautUsername();
        String password = loginRequest.getMautPassword();
//        String role = loginRequest.getMrolid();

        // Call the service to authenticate the user
        String result = comserv.getAuthenticatedUser(username, password);

        // Check the result from the authentication service and return the corresponding response
        if ("login successful".equalsIgnoreCase(result.trim())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
	

}
