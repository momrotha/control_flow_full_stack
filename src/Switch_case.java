import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        /**
         * int a = 19;
         *         switch (a){
         *             case 18:{
         *                 System.out.println("can vote");
         *                 break;
         *             }
         *             case 17:{
         *                 System.out.println("can't vote");
         *                 break;
         *             }
         *             default:{
         *                 System.out.println("this is not a");
         *             }
         *         }
         */

        System.out.println("[+] បញ្ចូលជម្រើស: ");
        int ជម្រើស= new Scanner(System.in).nextInt();
        switch (ជម្រើស){
            case 1:{
                System.out.println("ជម្រើសទី១");
                break;
            }
            case 2:{
                System.out.println("ជម្រើសទី២");
                break;
            }
            case 3:{
                System.out.println("ជម្រើសទី៣");
                break;
            }
            default:{
                System.out.println("មិនមានជម្រើស");
            }
        }
    }
}
