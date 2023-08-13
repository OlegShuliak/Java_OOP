
/*
Принцип инверсии зависимостей.
Осуществлен интерфейс, метод в котором должен создавать объект типа User
 */



public interface IUserController<T extends User> {
    void create(String firstName, String secondName, String LastName);

}
