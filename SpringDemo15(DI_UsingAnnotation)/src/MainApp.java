import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String ar[])
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ByType AutoWiring
		Employee e = (Employee) context.getBean("employee");
		
		
		System.out.println("Employee Details : "+e);
			
	}
}
