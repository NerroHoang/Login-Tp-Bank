
package View;

import java.util.Locale;
import Controller.Login;

public class Menu {    
    public void display() {
        Login loginController = new Login();
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = loginController.checkInputIntLimit(1, 3, english);
        switch (choice) {
            case 1:
                loginController.login(vietnamese);
                break;
            case 2:
                loginController.login(english);
                break;
            case 3:
                return;
        }
    }
}
