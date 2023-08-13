
/*
Принцип единственной ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс для создания User
 */
public class UserController implements IUserController {
    @Override
    public void create(String firstName, String secondName, String lastName) {
        User newUser = new User(firstName, secondName, lastName);
    }
}
