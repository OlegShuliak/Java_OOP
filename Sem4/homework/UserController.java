public interface UserController <T extends User>{
    void createUser(String firstName, String secondName, String lastName, Long idParameter);
}
