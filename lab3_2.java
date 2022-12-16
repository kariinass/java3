import java.util.Scanner;
import java.util.Arrays;

public class lab3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int n = input.nextInt();
        int[] array = new int[n];
        if (n < 0) {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной");
            return;
        }

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Введите элемент, который нужно удалить из массива:");
        int x = input.nextInt();

        System.out.println("Исходный массив: " + Arrays.toString(array));
        int[] newArray = new int[n];

        for (int i = 0; i < array.length; i++) {
            if(array[i] == x) {
                newArray = new int[array.length - 1];
                for(int index = 0; index < i; index++){
                    newArray[index] = array[index];
                }
                for(int j = i; j < array.length - 1; j++){
                    newArray[j] = array[j+1];
                }
                break;
            } else {
                newArray[i] = array[i];
            }

            }
            System.out.println("Массив после обработки: " + Arrays.toString(newArray));
        }
    }
