import java.util.Scanner;

public class Test {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";
    public static void main(String[] args) {
        System.out.print("[+] Insert username: ");
        String username = new Scanner(System.in).nextLine();
        System.out.print("[+] Insert password: ");
        String password = new Scanner(System.in).nextLine();
        if(username.equals(USERNAME)&&password.equals(PASSWORD)){
            System.out.println("Login successful");
        }else {
            System.out.println("Login failed");
        }


    }
}
