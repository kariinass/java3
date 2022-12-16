import java.util.Scanner;
import java.util.Arrays;

public class lab3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 0, array[];

        System.out.print("Введите размерность массива: ");
        if(in.hasNextInt())
            array_size = in.nextInt();

        array = new int[array_size];

        for(int i=0; i < array_size; i++) {
            System.out.print("ВВедите элементы массива: ");
            if (in.hasNextInt()) {
                array[i] = in.nextInt();
            }
        }
        System.out.print("Исходный массив:");
        System.out.println(" " + Arrays.toString(array));

        float tmp = array[0];

        double[] arrDouble = new double[array.length];
        arrDouble[0] = tmp;

        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            arrDouble[i] = sum / (i + 1);
        }

        System.out.print("Массив посе обработки: ");
        System.out.println(" " + Arrays.toString(arrDouble));
        in.close();
    }
}
