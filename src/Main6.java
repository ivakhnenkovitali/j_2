import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        int[] arr1 = null;
        int size = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол-во элементов массивов");
        size = scanner.nextInt();

        arr1 = new int[size]; // выделить память для массива как только пользователь
        // пользователь определисся с кол- вом  элементов
        // arr1. length - public final поле общее код-во элементов массивае

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
            System.out.println( " заполение масиива новыми значениями");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println("введите " + (i + 1) + " элемент массива");
                arr1[i] = scanner.nextInt();
            }
            //Arrays - дополнительный класс  содержащий кучу статических методов
            // стастических (static) методов
            //Arrays.toString(arr1) превращает массив в его строковое представление
            System.out.println(Arrays.toString(arr1));
        }
    }
//////////////////ВАРИАНТЫ КАК ВЫВОДИТЬ МАССИВ


