package assignments;
import java.util.Scanner;

public class A6Q2 {
    public static void main(String[] args) {
cube();
    }
    public static void cube()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number and I will cube it");
        int num = input.nextInt();

        int cube = num * num * num;
        System.out.println("cube = " + cube);
    }
}
