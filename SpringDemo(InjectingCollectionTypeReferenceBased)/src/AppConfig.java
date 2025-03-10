import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

    @Bean(name = "team")
    public Team getTeam() {
        return new Team();
    }

    @Bean
    public ArrayList<Person> getList() {
        ArrayList<Person> plist = new ArrayList<>();
        plist.add(new Person(101, "Amit"));
        plist.add(new Person(102, "Sumit"));
        plist.add(new Person(103, "Ajit"));
        return plist;
    }
}
