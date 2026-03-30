// Запуск: java lab3.Problem5.SortTest
package lab3.Problem5;

public class SortTest {
	public static void main(String[] args) {

		// === Chocolates (bubbleSort by weight) ===
		System.out.println("=== BubbleSort Chocolates ===");
		Chocolate[] chocolates = {
			new Chocolate(12, "KitKat"),
			new Chocolate(30, "Albeni"),
			new Chocolate(18, "Twix"),
			new Chocolate(10, "Snickers"),
			new Chocolate(22, "Bounty"),
			new Chocolate(15, "Mars")
		};

		Sort.bubbleSort(chocolates);
		for (Chocolate c : chocolates) {
			System.out.println(c);
		}

		// === Times (mergeSort by h:m:s) ===
		System.out.println("\n=== MergeSort Times ===");
		NewTime[] times = {
			new NewTime(14, 30, 0),
			new NewTime(8, 15, 45),
			new NewTime(23, 0, 0),
			new NewTime(8, 15, 30),
			new NewTime(12, 0, 0)
		};

		Sort.mergeSort(times);
		for (NewTime t : times) {
			System.out.println(t);
		}

		// === Same weight chocolates (compare by name) ===
		System.out.println("\n=== Same weight -> sort by name ===");
		Chocolate[] sameWeight = {
			new Chocolate(20, "Twix"),
			new Chocolate(20, "Bounty"),
			new Chocolate(20, "Albeni"),
		};

		Sort.bubbleSort(sameWeight);
		for (Chocolate c : sameWeight) {
			System.out.println(c);
		}
	}
}
