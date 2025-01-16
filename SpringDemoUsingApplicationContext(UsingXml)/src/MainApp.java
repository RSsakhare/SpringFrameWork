import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Student s1 = (Student) ac.getBean("stud");
		s1.display();
		
		Student s2 = (Student) ac.getBean("stud");
		s2.display();
	}

}
