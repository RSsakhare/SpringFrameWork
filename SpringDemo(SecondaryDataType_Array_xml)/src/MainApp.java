import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{	
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");   
		
		Computer cmp = (Computer) ac.getBean("ctp");
		cmp.printData();
	}
}
