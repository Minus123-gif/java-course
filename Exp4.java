import java.util.Scanner;
public class Exp4 {
    public static void main(String[]args) {
        System.out.print("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        int sum = (b%a);
       System.out.println(sum);
    }
    }
    // Поділ яблук - 2
    // N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
    // Скільки яблук залишиться у кошику?
