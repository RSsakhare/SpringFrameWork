import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

	@Bean(name = "emp")
	public Employee getEmp()
	{
		return new Employee();
		
	}
	
	@Bean(name = "stud")
	public Student getstud()
	{
		return new Student();
		
	}
}
