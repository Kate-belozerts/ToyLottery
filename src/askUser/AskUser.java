package askUser;

import java.util.Scanner;

public class AskUser {

    public static int Start() {
        Scanner scanner = new Scanner(System.in);
        Menu.printMenu();
        return scanner.nextInt();
    }
}
