import java.util.Scanner;

public class Switch_homework {
    public static void main(String[] args) {
        System.out.print("[+] Insert number1 : ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert number2 : ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("=".repeat(30));
        System.out.println("""
                1. Sum number
                2. Find maximun
                3. Find minimun
                4. Swap numbers
                5. Exit program
                """);
        System.out.println("=".repeat(30));
        System.out.print("Chose option: ");
        int option = new Scanner(System.in).nextInt();
        switch (option) {
            case 1:{
                option = number1 + number2;
                System.out.println("Sum number is : "+ option);
                break;
            }
            case 2:{
                option = Math.max(number1, number2);
                System.out.println("Find maximun is : "+ option);
                break;
            }
            case 3:{
                option = Math.min(number1, number2);
                System.out.println("Find minimun is : "+ option);
                break;
            }
            case 4:{
                System.out.println("Before swap: number1 = " + number1 + ", number2 = " + number2);
                int temp = number1;
                number1 = number2;
                number2 = temp;
                System.out.println("After swap: number1 = " + number1 + ", number2 = " + number2);
                break;

            }
            case 5:{
                System.out.println("Exit program");
                System.exit(0);
            }
            default:{
                System.out.println("Invalid option");
            }

        }
    }
}
