import java.util.Arrays;

public class Main7 {
    public static void main(String[] arg) {
        ////  Math-   клас  содержащий математичекие методы
        ///   Math.random() возврощает случайное вещественное вещественное число от  0 до 1 (не включая 1)
        /// [0; 1) он будет выдовать случайное число от  0 до 0.999999999999999999999999


        ////// РАНДОНИТЬ ЗНАЧЕНИЕ ОТ ЧЕГОТА  ДО ЧЕГОТА    одно число  ===============================

        ///        [0;1)*17 =[0;17)
        ///         [0;17) + 4 = [4; 21)
        ///         (int) [4; 21) = [4; 20]    виедео-----------13-я митнута

        int min = 4, max = 20;


        int x = (int)  (Math.random() * (max - min + 1) + min);
        System.out.println(x);

        final int SIZE = 10;    ////создали масси и выделили 10 элементов  случайныеми числами от  4х до  20.
        int[] arr1 = new int[SIZE];

        for (int i = 0; i < arr1.length; i++) {

            ////увеличение массива на 5 элементов
            ///copy0f - создает копию массива
            /// int [] arr2 = arr1; не получаем копию массива, а вторую ссылку на тот же моссив

            ////чтобы создовать точную копию массива нужен copy0f
            /// Arrays.copy0f (откуда-копировать, размер -новаого массива);

            int[] arr2 = Arrays.copyOf(arr1, arr1.length);
            System.out.println("массива копия");
            System.out.println(Arrays.toString(arr2));

            /////методы  Arrays.


        }

        System.out.println(Arrays.toString(arr1));


    }

}
