package DAY0110.student2;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//이 클래스는 스프링 설정에 사용되는 클래스라는 뜻 
@Configuration
public class AppConfig {
	
	@Bean  //객체생성
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
	
		Student student = new Student("홍길동", 20, hobbys); //생성자에 설정
		student.setHeight(180); //프로퍼티에 설정
		student.setWeight(80);
		
		return student;
	}
	
	@Bean  //객체생성
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("요리");
	
		Student student = new Student("홍길동", 20, hobbys); //생성자에 설정
		student.setHeight(180); //프로퍼티에 설정
		student.setWeight(80);
		
		return student;
	}
	

	@Bean  //객체생성
	public Rectangle rectangle() {
		
		Rectangle rec = new Rectangle();
		rec.setHeight(7); 
		rec.setWidth(8);
		
		return rec;
	}
}
