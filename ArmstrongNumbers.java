import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(checkArmstrongNumber(number));
    }
    public static String checkArmstrongNumber(int number){
        int duplicate = number;
        int rev = 0;
        while(number>0){
            int num = number % 10;
            rev = (num * num * num) + rev;
            number = number / 10;
        }
        if(rev == duplicate) return "It is a Armstrong Number";
        else return "It is not a Armstrong Number";
    
    }
}