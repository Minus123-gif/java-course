import java.util.Scanner;
public class Ex2 {
    public static void main(String[]args) {
        System.out.print("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        if(a>0){
            count = a + 1;
            System.out.println(" The next number for the number " + a + " is " + count);
        }
        if(a>0){
            count = a - 1;
            System.out.println(" The previous number for the number " + a + " is " + count);
        }
    }
}
// Наступне та попереднє
// Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
// прикладі. Прогалини, розділові знаки, великі і малі літери важливі!