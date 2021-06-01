package assignments;
import java.util.Scanner;



public class A5Q5 {
    public static void main(String[] args) {
        sign();
    }
    public static void sign(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number and I will tell if it is negative, positive or zero");
        int num = input.nextInt();
        if (num > 0)
        {
            System.out.println("It is positive");
        }
        else if (num < 0)
        {
            System.out.println("It is negative");
        }
        else
        {
            System.out.println("It is zero");
        }
    }
}
