import java.util.ArrayList;
import java.util.List;
/*
* Здесь осуществляетя принцип единой ответственности
* Данный класс отвечает только за создание списка c данными типа User
*/
public class DataService {
    private List<User> users;

    public DataService(){
        this.users = new ArrayList<>();
    }
    public List<User> getAll(){
        return this.users;
    }

}
