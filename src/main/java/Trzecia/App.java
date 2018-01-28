package Trzecia;

import java.util.logging.Logger;
//import static java.awt.Window.log;

/**
 * Hello world!
 */
public class App {
    protected static final Logger log = Logger.getLogger ( App.class.getName () );


    public static void main ( String[] args ) {


        UserService userService = new UserServiceImplemets ();
        boolean islogin = userService.login ( "Pawel", "Pawel" );
        log.info ( "Zalogowany: " + islogin );
        User user1 = new User ();
        user1.setLogin ( "Pawel" );
        user1.setPassword ( "Pawel" );
        userService.registration ( user1 );
        boolean islogin1 = userService.login ( "Pawel", "Pawel" );
        log.info ( "Zalogowany: " + islogin1 );
        user1.setPassword ( "nowyPawel" );
        userService.changePassword ( "Pawel", "Pawel", "newPawel" );
        boolean islogin2 = userService.changePassword ( "Pawel", "Pawel", "newPawel" );
        log.info ( "Zalogowany: " + islogin2 );
//log.info ();
    }
}

        /*Scanner sc = new Scanner ( System.in );
        User user = new User ( User.getid, User.getdateOfBirth, User.getname, User.getlastname, User.getlogin, User.getpassword, User.getemail );


        int licznik = 0;
        do {
            System.out.println ( "1. Rejestracja Uzytkownika.\n2. Logowanie Użytkownika.\n3. Zmiana Hasła Uzykownika\n0. Wylogowanie" );
            int wybor = sc.nextInt ();

            if (wybor == 1) {
                System.out.println ( "Podaj imie aby sie zarejestrować : " );
                User.getname = sc.next ();
                User.getname = User.getname;
                System.out.println ( "Podaj nazwisko: " );
                User.getlastname = sc.next ();
                System.out.println ( "Twój login to: " + User.getname + " " + User.getlastname );
                User.getlogin = User.getlastname + User.getlastname;
                System.out.println ( "Podaj hasło do logowania: " );
                User.getpassword = sc.next ();
            } else if (wybor == 2) {
                System.out.println ( "Podaj login do zalogowania :" );
                String name = sc.next ();
                System.out.println ( "Podaj hasło do zalogowania" );
                String lastName = sc.next ();
                System.out.println ( User.getlogin + " Zalogowany" );


            } else if (wybor == 3) {
                //TODO dodac zmiana hasła uzytkownika
            } else if (wybor == 0) {
                // TODO dodac wyjscie
            }
            licznik++;
            System.out.println ( "" );
        } while (licznik < 10);
        log.info ( "To jest log o poziomie info" );
        log.warning ( "To jest log o poziomie warning" );

    }*/



