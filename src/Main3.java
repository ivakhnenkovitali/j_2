import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main3 {
    public static void main(String []args) {


    int x = 0;                 ///объявление преременной
    Scanner scanner = new Scanner(System.in);

    System.out.println("введите число");
    x =scanner.nextInt();

    x = x < 0 ? x * 2 : (x > 0 ? x + 10 : 100);   ///работа тернарника
    System.out.println("x = " + x);

}

}
