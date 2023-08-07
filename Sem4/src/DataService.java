import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users;

    public DataService(){
        this.users = new ArrayList<>();
    }
    public List<User> getAll(){
        return this.users;
    }

}
