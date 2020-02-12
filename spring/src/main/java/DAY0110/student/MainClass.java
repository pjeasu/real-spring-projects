package DAY0110.student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLocation = "classpath:./DAY0110/appCTX.xml";
		AbstractApplicationContext  ctx = new GenericXmlApplicationContext(configLocation);
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo.getStudentInfo();
		
		
		Student student2 = ctx.getBean("student2", Student.class);
		
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		ctx.close();
		
		
	}
}
