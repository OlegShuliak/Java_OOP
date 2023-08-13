import java.util.List;
/*
Принцип единственной ответственности и принцип разделения интерфейсов
Осуществлен только один необходимый интерфейс c методом просмотра User и наследников
 */
public interface UserView<T extends User> {
    void sendOnConsole(List<T> listT);
}
