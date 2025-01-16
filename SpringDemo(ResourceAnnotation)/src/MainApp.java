import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Application a1 = (Application) context.getBean("application");
		System.out.println(a1);
	}
}
