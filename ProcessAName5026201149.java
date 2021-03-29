import java.util.*;
import java.lang.*;

public class ProcessAName5026201149 {
    public static void main(String[] args) {
        String firstName, secondName;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");

        String userName = scanner.nextLine();
        firstName = userName.substring(0,1);
        secondName = userName.substring(userName.indexOf(" ")+1);
        System.out.println("Your name is: " + secondName +", " + firstName + ".");
    }
}
