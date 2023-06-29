package com.gopi.HibernateProject1.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="bank_account")
public class BankAccount implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="bank_name",nullable = false)
	private String bankName;
	@Column(name="account_number",nullable = false,unique = true)
	private String accountNumber;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String bankName, String accountNumber) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", bankName=" + bankName + ", accountNumber=" + accountNumber + "]";
	}
	
}
