public class Main4 {
    public static void main(String[] arg) {


        int num1 = 8;  ///  по номеру числа   ---------------  можно вывести--- вывести название
        switch (num1) {                             ///  тестируем   switch
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четвверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("субота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("чтото пошло не так");
                break;

        }

        System.out.println("---------------------------");

        int num2 = 0;
        String day2 = "вторник"; // можно было организавать через ввод с клавиатуры

        switch (day2) {
            case "понедельник":
                num2 = 1;
                break;
            case "вторник":
                num2 = 2;
                break;
            case "среда":
                num2 = 3;
                break;
            case "четверг":
                num2 = 4;
                break;
            case "пятница":
                num2 = 5;
                break;
            case "субота":
                num2 = 6;
                break;
            case "воскресенье":
                num2 = 7;
                break;
            default:
                num2 = -1;
                break;
        }
        System.out.println("номер дня " + num2);

        System.out.println("-------------------------");
        // по названию дня выдать сообщение будний это день или выходной

        String day3 = "чесверг";
        switch (day3) {
            case "понедельник":
                System.out.println("будни");
                break;
            case "вторник":
                System.out.println("будни");
                break;
            case "среда":
                System.out.println("будни");
                break;
            case "четверг":
                System.out.println("будни");
                break;
            case "пятница":
                System.out.println("будни");
                break;
            case "субота":
                System.out.println("будни");
                break;
            case "воскресенье":
                System.out.println("будни");
                break;
            default:
                System.out.println("что то пошло не так");
                break;
        }

        System.out.println("-------------------");
        switch (day3) {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
            case "субота":
            case "воскресенье":
                System.out.println("будни");
                break;
            default:
                System.out.println("что то пошло не так");
                break;
        }

        System.out.println("-----------------");

        switch (day3) {
            case "понедельник", "вторник", "среда", "четверг", "пятница":
                System.out.println("будни");
                break;
            case "субота", "воскресенье":
                System.out.println("выходной");
                break;
            default:
                System.out.println("что то пошло не так");
                break;
        }

        System.out.println("------------------");
        //// ПО НАЗВАНИЮ ДНЯ ПОЛУЧИТЬ ЕГО НОМЕР
        int num4 = 0;
        String day4 = "субота";

        num4 = switch (day4) {
            case "понедельник" -> 1;
            case "вторник" -> 1;
            case "среда" -> 1;
            case "четверг" -> 1;
            case "пятницф" -> 1;
            case "субота" -> 1;
            case "воскресенье" -> 1;
            default -> {
                System.out.println("что то пошло не так");
                yield -1;
            }
        };
        System.out.println("номер дня:" + num4);
    }
}







