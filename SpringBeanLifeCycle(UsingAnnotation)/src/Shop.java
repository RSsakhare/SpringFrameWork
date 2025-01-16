import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shop  {

    public Shop() {
        System.out.println("Shop Bean Created");
    }

    public void greetCustomer() {
        System.out.println("Welcome to Shop");
    }

    @PostConstruct
    public void init() {
        System.out.println("Shop init method called");
    }

    @PreDestroy
    public void destroy()  {
        System.out.println("Shop destroy method called");
    }
}
