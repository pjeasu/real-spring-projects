package edu.bit.ex.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//15-1

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {

		return Student.class.isAssignableFrom(arg0);
		//검증할 객체의 클래스 타입 정보
	}

	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()");
		Student student = (Student)obj;
		
//		//검증할 속성 가져오기
//		String studentName = student.getName();
//	
//		if(studentName == null || studentName.trim().isEmpty()) {
//			System.out.println("studentName is null or empty");
//			errors.rejectValue("name", "trouble");
//			//에러객체에 키 밸류 형식으로 값을 지정 (필드네임,에러코드)
//		}
//		
//		int studentId = student.getId();
//		
//		if(studentId == 0) {
//			System.out.println("studentId is 0");
//			errors.rejectValue("id", "trouble");
//		}
		
		//위의 주석부분 코드를 한줄로 줄이는 메소드 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "trouble");
	
		
		
		
		
		
		
	}
	
	
}

