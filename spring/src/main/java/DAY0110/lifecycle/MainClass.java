package DAY0110.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// 호출하는 주체는 Ioc 컨테이너 , 스프링! 
		
		
		//GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:./DAY0110/appCTX3.xml");
		//파라미터로 넣게되면 아래 두줄의 코드가 필요 없다. 
		
		ctx.load("classpath:./DAY0110/appCTX3.xml");
		ctx.refresh();
		System.out.println("ctx.close() 호출전");
		ctx.close();
		System.out.println("ctx.close() 호출후");
	}
}
