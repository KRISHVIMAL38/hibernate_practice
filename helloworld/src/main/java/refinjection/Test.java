package refinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("refinjection/refconfig.xml");
		A tmp=(A)context.getBean("abean");
		
//		System.out.println(tmp.getX());
//		System.out.println(tmp.getObj().getY());
		
		System.out.println(tmp);
	}

}
