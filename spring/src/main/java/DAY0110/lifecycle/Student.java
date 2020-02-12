package DAY0110.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

	private String name;
	private int age;


	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public Student() {
		System.out.println("생성자 호출");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() 호출");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() 호출");
	}

	
}
