import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

	@Bean(name = "stud")
	public Student getStudent()
	{
		return new Student();
		
	}
	
	@Bean
	public List<String> nameList()
	{
		ArrayList <String> Qlist = new ArrayList<>();
		Qlist.add("BCA");
		Qlist.add("BCS");
		Qlist.add("MCA");
		return Qlist;
		
	}

	
}
