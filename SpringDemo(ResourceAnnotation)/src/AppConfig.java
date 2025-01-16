import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

	@Bean(name = "application")
	public Application ApplicationConfig()
	{
		return new Application();
	
	}
	
	@Bean(name = "applicationUser")
	public ApplicationUser ApplicationUserConfig()
	{
		return new ApplicationUser();
	
	}
}
