package assignments;

import java.util.Scanner;

public class A5Q4 {
    public static void main(String[] args) {
        hollowRect();
}
public static void hollowRect(){

    Scanner input = new Scanner(System.in);


    int h = 5;


    int w = 5;

    for(int j=1; j<=h; j++)
    {
        for(int i=1; i<=w; i++)
        {
            if(j ==1 || j==h || i==1 || i==w)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
