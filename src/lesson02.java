import java.util.Scanner;

public class lesson02 {
    public static void main(String[] args) {

int age = 0;
double salary = 0.0;
String name = null;
        ///String -класс для использования строк43
        ///null- обозначение ппустой сссылки т е ссылка не указана на объект
        ///все переменными класса являются ссылками
        ///для считования из консоли необходимо создать объет класса
        ///Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите возраст");
        age = scanner.nextInt();
        System.out.println("введите зп");
        salary = scanner.nextDouble();

        System.out.println("возраст: " + age + ", зп: " + salary);

       scanner.skip("\n");  // после ввода числа   перед вводом строки
        System.out.println("введите имя");
        name = scanner.nextLine();  ///считывает с пробельными символами
        System.out.println("имя: " + name );

    }
}
