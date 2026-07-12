package Dto;

public class Customer {
	int id;
 String name;
 String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public void setAddress(String address) {
	this.address = address;
}
 
}
