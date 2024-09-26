import java.util.Arrays;

public class ArrayUtils {

    // Метод для сортування злиттям
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // масив уже відсортований
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Рекурсивне сортування
        mergeSort(left);
        mergeSort(right);

        // Злиття відсортованих масивів
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Злиття
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Додаємо залишилися елементи
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Метод для бінарного пошуку
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Знайдено
            } else if (array[mid] < target) {
                left = mid + 1; // Пошук у правій частині
            } else {
                right = mid - 1; // Пошук у лівій частині
            }
        }

        return -1; // Не знайдено
    }
}
