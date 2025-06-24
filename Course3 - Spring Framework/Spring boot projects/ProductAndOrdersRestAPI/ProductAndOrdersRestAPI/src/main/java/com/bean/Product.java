package com.bean;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
@Id
private int pid;
private String pname;
private float price;
@OneToMany
@JoinColumn(name = "pid")  // FK in orders tables. 
private List<Orders> listoforders;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public List<Orders> getListoforders() {
	return listoforders;
}
public void setListoforders(List<Orders> listoforders) {
	this.listoforders = listoforders;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", listoforders=" + listoforders + "]";
}

}
