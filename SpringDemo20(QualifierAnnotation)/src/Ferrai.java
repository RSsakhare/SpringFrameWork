import org.springframework.stereotype.Component;

@Component("Ferrai")
public class Ferrai implements Car{

	public void getCarName()
	{
		System.out.println("This is Ferrai");
	}

}
