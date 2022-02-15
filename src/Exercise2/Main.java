package Exercise2;
/*Создать список целых чисел, заполнить его десятью случайными значениями в диапазоне от 10 до 20-ти(включительно).
 Вывести индекс самого большого и самого маленького числа в списке.
  Используя ListIterator пройтись по списку и увеличить значения на 1, вывести список в консоль.
 */

import java.util.*;


public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		int[] array = {11, 16, 10, 13, 14, 19, 18, 17, 12, 20, 15};


		System.out.println("**************************************************");

		System.out.println(array.length);
		System.out.println();
		System.out.println(Arrays.stream(array).max());
		System.out.println();
		System.out.println(Arrays.stream(array).min());
		System.out.println("=================================================");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {

			}
			System.out.println(array[i] + 1);
		}
		System.out.println("****************************************");


		int indexOfMax = 0;
		int indexOfMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[indexOfMax]) {
				indexOfMax = i;
			} else if (array[i] < array[indexOfMin]) {
				indexOfMin = i;
			}
		}
		System.out.println("Index of maximum number: " + indexOfMax + " , " + "Index of minimum number: " + indexOfMin);
	}
}

