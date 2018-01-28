package Trzecia;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImplemets implements UserService {
    List <User> userList = new ArrayList <User> ();

    public boolean registration ( User user ) {
        userList.add ( user );
        return true;
    }

    public boolean login ( String login, String password ) {
        for (int i = 0; i < userList.size (); i++) {
            if (login.equals ( userList.get ( i ).getLogin () )) {
                if (password.equals ( userList.get ( i ).getPassword () )) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean changePassword ( String password ) {
        return false;
    }

    public boolean changePassword ( String login, String oldPassword,String newPassword ) {
        for (int i = 0; i < userList.size (); i++) {
            if (login.equals ( userList.get ( i ).getLogin () )){
                if (oldPassword.equals ( userList.get ( i ).getPassword () )){
                    userList.get ( i ).setPassword ( newPassword );
                    //newPassword = oldPassword;
                    return true;
                }

            }
        }
        return false;
    }
}
