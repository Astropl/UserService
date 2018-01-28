package Trzecia;

public interface UserService
     {

        public boolean registration(User user);
        public boolean login(String login, String password);
        public void changePassword(String password);
    }







