import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//ByType AutoWiring
		Student s1 = (Student) context.getBean("stud");
		System.out.println(s1);
	}

}
