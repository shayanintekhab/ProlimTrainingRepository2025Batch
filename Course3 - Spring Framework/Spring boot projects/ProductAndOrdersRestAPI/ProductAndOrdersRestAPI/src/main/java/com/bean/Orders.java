package com.bean;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)		// auto_increment 
private int oid;
private int pid;			// FK 
private LocalDateTime orderdateandtime;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public LocalDateTime getOrderdateandtime() {
	return orderdateandtime;
}
public void setOrderdateandtime(LocalDateTime orderdateandtime) {
	this.orderdateandtime = orderdateandtime;
}
@Override
public String toString() {
	return "Orders [oid=" + oid + ", pid=" + pid + ", orderdateandtime=" + orderdateandtime + "]";
}

}
