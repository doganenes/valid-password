import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Password rules:\n"
                + "Password must have at least eight characters\n"
                + "Password must consist of only letters and digits\n"
                + "Password must contain at least two digits\n"
                + "Write a password:");

        String passW = sc.nextLine();
        isValidPassword(passW);
    }

    public static void isValidPassword(String password) {
        boolean passwordIsValid = true;
        int isDigit = 0;


        if (password.length() > 8) {
            for (char c : password.toCharArray()) { // toCharArray ile password'deki karakterler charArray şekline dönüşür.
                if (Character.isDigit(c)) {
                    isDigit++;
                } else if (!Character.isAlphabetic(c)) { //alfabetik karakterler içeriyorsa true içermiyorsa false (isAlphabetic)
                    passwordIsValid = false;
                    break;
                }
            }
        }

        if (passwordIsValid && isDigit >= 2) {
            System.out.print("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
