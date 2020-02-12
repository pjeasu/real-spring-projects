package edu.bit.ex.validator;

//15-1

public class Student {
	private String name;
	private int id;
	//변수를 선언하고 값을 지정하지않을경우 String은 null, int는 0값이 들어간다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
