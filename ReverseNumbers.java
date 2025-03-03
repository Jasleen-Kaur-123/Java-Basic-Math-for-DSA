import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        System.out.println(ReverseNumber(number));
    }
    public static int ReverseNumber(int number){
        int mixnum = 0;
        while(number>0){
            int num = number % 10; // it will return the last number of defined "number" //7789
            mixnum = (mixnum*10) + num ; // will add number one by one and write reverse of original number // 7789->9877
            number = number / 10; // will give quotient or remaining number // 7789 //778 // 77 //7
        }
        return mixnum;
    }
}