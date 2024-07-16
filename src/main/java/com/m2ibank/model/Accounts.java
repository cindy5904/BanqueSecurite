package com.m2ibank.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Accounts {

	@Column(name = "user_id")
	private int userId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_number")
	private long accountNumber;

	@Column(name="account_type")
	private String accountType;

	@Column(name = "branch_address")
	private String branchAddress;

	@Column(name = "create_dt")
	private String createDt;
	
	

	
}
