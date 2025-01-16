import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ac.getBean(Employee.class);
		System.out.println(e);
	}
}
