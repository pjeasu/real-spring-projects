package DAY0110.lifecycle;

import javax.annotation.*;

public class OtherStudent{

	private String name;
	private int age;

	
	
	public OtherStudent() {}
	
	
	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@PostConstruct //버전 지원안함.. 
	public void initMethod() {
		System.out.println("initMethod() 호출");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod() 호출");
	}
	


	
	
}
