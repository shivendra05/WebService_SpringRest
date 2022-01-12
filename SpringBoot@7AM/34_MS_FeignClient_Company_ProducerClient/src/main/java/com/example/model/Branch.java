package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Branch {

	private int branchID;
	private String branchName;
	private String branchAddr;
}
