import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String ar[])
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = (Employee) ac.getBean("emp");
		Student s = (Student) ac.getBean("stud");
		
		System.out.println(e);
		System.out.println(s);
		

		
	}
}
