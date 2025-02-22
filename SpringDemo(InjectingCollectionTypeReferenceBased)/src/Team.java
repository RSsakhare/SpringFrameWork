import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("team")
public class Team {

    int tid;
    String tname;

    @Autowired
    ArrayList<Person> plist;

    public Team() {
        super();
    }

    public Team(int tid, String tname, ArrayList<Person> plist) {
        super();
        this.tid = tid;
        this.tname = tname;
        this.plist = plist;
    }

    public int getTid() {
        return tid;
    }

    @Value(value = "101")
    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    @Value(value = "Sales")
    public void setTname(String tname) {
        this.tname = tname;
    }

    public ArrayList<Person> getPlist() {
        return plist;
    }

    public void setPlist(ArrayList<Person> plist) {
        this.plist = plist;
    }

    @Override
    public String toString() {
        return "Team [tid=" + tid + ", tname=" + tname + ", plist=" + plist + "]";
    }
}
