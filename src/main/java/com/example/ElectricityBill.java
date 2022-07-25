package com.example;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class ElectricityBill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	
private Date billDate;

private Date paidDate;
private double unitConsumed;
private double amount;
public ElectricityBill(Date billDate, Date paidDate, double unitConsumed, double amount) {
	super();
	this.billDate = billDate;
	this.paidDate = paidDate;
	this.unitConsumed = unitConsumed;
	this.amount = amount;
}
public ElectricityBill() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getBillDate() {
	return billDate;
}
public void setBillDate(Date billDate) {
	this.billDate = billDate;
}
public Date getPaidDate() {
	return paidDate;
}
public void setPaidDate(Date paidDate) {
	this.paidDate = paidDate;
}
public double getUnitConsumed() {
	return unitConsumed;
}
public void setUnitConsumed(double unitConsumed) {
	this.unitConsumed = unitConsumed;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "ElectricityBill [id=" + id + ", billDate=" + billDate + ", paidDate=" + paidDate + ", unitConsumed="
			+ unitConsumed + ", amount=" + amount + "]";
}




}
