import java.util.Scanner;

public class TakeFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
       String name = scanner.nextLine();
        System.out.println("Hey " + name);
    }
}
