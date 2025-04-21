package com.erp.test.model;

import jakarta.persistence.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "FACVLEDGER")
public class FACHVLedger implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
    private FACHVLedgerId id;

    // Getters and Setters for each property (if needed)

    public FACHVLedgerId getId() {
        return id;
    }

    public void setId(FACHVLedgerId id) {
        this.id = id;
    }
    
}
