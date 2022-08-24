import java.util.Scanner;
public class Exp1 {
    public static void main(String args[]){
        System.out.print("Введите число:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.print("Введите число:");
    int b = sc.nextInt();
    System.out.println(Math.pow(a,2) + Math.pow(b,2));
    }
}
