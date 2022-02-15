package Exercise1;
/*В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль
 */

import java.util.ArrayList;

/*Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль
 */
public class Zoo {
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Jiraf");
		arrayList.add("Begemot");
		arrayList.add("Nosorog");
		arrayList.add("Lion");
		arrayList.add("Enot");
		arrayList.add("Krokodil");
		arrayList.add("Korova");
		arrayList.add("Zubr");

		System.out.println(arrayList);
		System.out.println(arrayList.size());

		System.out.println("==============================================================");

		arrayList.remove(2);
		System.out.println(arrayList);
		System.out.println(arrayList.size());

		System.out.println("==============================================================");

		arrayList.remove(3);
		System.out.println(arrayList);
		System.out.println(arrayList.size());

		System.out.println("==============================================================");

		arrayList.remove(4);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
	}

}
