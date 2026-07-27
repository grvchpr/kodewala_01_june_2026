package com.sbi.user1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	private String name;
	private int balance;

	/*
	 * Account() {
	 * 
	 * }
	 * 
	 * public Account(String name, int balance) {
	 * this.name = name;
	 * this.balance = balance;
	 * }
	 * 
	 * public Account(int _balance, String _name) {
	 * this.name = _name;
	 * this.balance = _balance;
	 * }
	 * 
	 * public String getName() {
	 * return name;
	 * }
	 * 
	 * public void setName(String name) {
	 * this.name = name;
	 * }
	 * 
	 * public int getBalance() {
	 * return balance;
	 * }
	 * 
	 * public void setBalance(int balance) {
	 * this.balance = balance;
	 * }
	 * 
	 * 
	 * public String getName() {
	 * return name;
	 * }
	 * 
	 * public int getBalance() {
	 * return balance;
	 * }
	 */

}
