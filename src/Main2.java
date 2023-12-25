import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ///если значение отрицательное увеличить его в 2 раза
        ///если положительное то увеличить на 10
        //если 0  то заменить на 100
        int x = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите число");
        x = scanner.nextInt();


        if (x < 0) {
            x = x * 2;  ///x *=2;

        } else if (x > 0) {
            x = x + 10; // x += 10

        } else {
            x = 100;

        }
        System.out.println("x = " + x);


    }

  }

