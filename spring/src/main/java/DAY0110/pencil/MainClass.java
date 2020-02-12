package DAY0110.pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLocation = "classpath:./DAY0110/appCTX2.xml";
		AbstractApplicationContext  ctx = new GenericXmlApplicationContext(configLocation);
		
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
		
		
		ctx.close();
	}
}
