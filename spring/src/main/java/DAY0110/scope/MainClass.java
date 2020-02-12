package DAY0110.scope;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:./DAY0110/appCTX4.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());
		
		System.out.println("=======================");
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("홍길자");
		student2.setAge(77);
		System.out.println("이름 : " + student2.getName());
		System.out.println("나이 : " + student2.getAge());
		
		
		System.out.println("=======================");
		System.out.println("이름 : " + student1.getName());
		System.out.println("나이 : " + student1.getAge());	
		
		
		System.out.println("=======================");
		
		//student1, student2 가 같은 객체인지 확인
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
			
		}else {
			System.out.println("student1 != student2");
		}
		
		
	}
}
