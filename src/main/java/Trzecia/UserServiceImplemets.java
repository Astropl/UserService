package Trzecia;

import java.awt.*;
import java.util.ArrayList;

public class UserServiceImplemets implements UserService
{ List<User> userList = new ArrayList<User>();

    public boolean registration(User user) {
        userList.add(user);
        return true;
    }

    public boolean login(String login, String password) {
        for(int i =0; i < userList.size(); i++){
            if (login.equals( userList.get(i).getLogin())){
                if(password.equals(userList.get(i).getPassword())){
                    return true;
                }
            }
        }
        return false;
    }
}
