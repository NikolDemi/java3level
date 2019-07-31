package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   
    /**
     * Задание 1 метод, который меняет два элемента массива местами.
     * (массив может быть любого ссылочного типа).
     */
    public static void swap(Object[] arr, int index1, int index2) {
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    /**
     * Задание 2   Мметод, который преобразует массив в ArrayList. Метод списала, сама не очень разобралась
     */
    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
