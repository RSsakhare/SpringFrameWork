import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
	public static void main(String ar[])
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ac.getBean("emp");
		e.printData();
		

		
	}
	
}