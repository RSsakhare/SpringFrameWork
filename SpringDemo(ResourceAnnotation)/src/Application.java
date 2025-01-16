import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("application")
@Scope("prototype")
public class Application {

	@Resource(name="applicationUser")
	private ApplicationUser user;

	public ApplicationUser getUser() {
		return user;
	}

	public void setUser(ApplicationUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Application [user=" + user + "]";
	}
	
	
}
