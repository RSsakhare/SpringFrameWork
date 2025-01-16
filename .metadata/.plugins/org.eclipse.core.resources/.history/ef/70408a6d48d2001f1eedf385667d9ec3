import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Shop implements InitializingBean, DisposableBean {

    public Shop() {
        System.out.println("Shop Bean Created");
    }

    public void greetCustomer() {
        System.out.println("Welcome to Shop");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Shop init method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Shop destroy method called");
    }
}
