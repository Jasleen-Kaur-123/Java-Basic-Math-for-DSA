import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println(checkPalindrome(number));
    }
    public static String checkPalindrome(int number){
        int duplicate = number;
        int rev = 0;
        while(number>0){
            int num = number % 10;
            rev = (rev*10) + num;
            number = number / 10;
        }
        if(rev == duplicate) return "It is a Palindrome Number";
        else return "It is not a Palindrome Number";
    }
}