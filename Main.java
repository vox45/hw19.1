import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10]; // Масив на 10 елементів

        // Заповнюємо масив випадковими числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Випадкові числа від 0 до 99
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Сортуємо масив
        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        // Використовуємо бінарний пошук
        int target = 50; // Цільове значення для пошуку
        int result = ArrayUtils.binarySearch(array, target);

        if (result != -1) {
            System.out.println("Значення " + target + " знайдено за індексом: " + result);
        } else {
            System.out.println("Значення " + target + " не знайдено у масиві.");
        }
    }
}
