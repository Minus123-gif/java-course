import java.util.Scanner;
public class Exp3 {
    public static void main(String[]args) {
        System.out.print("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        System.out.println(b/a);
    }
}
// Поділ яблук - 1
// N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
// Скільки яблук дістанеться кожному школяреві?