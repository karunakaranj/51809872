package com.example.PersonalLoan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int approvingManagerId;
	private int loanAccountNumber;
	private String loanStatus;
	private Long loanAmount;
	public int getApprovingManagerId() {
		return approvingManagerId;
	}
	public void setApprovingManagerId(int approvingManagerId) {
		this.approvingManagerId = approvingManagerId;
	}
	public int getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(int loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [approvingManagerId=" + approvingManagerId + ", loanAccountNumber=" + loanAccountNumber
				+ ", loanStatus=" + loanStatus + ", loanAmount=" + loanAmount + "]";
	}
	
	

}
