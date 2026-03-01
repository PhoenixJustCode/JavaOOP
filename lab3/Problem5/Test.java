package Problem5;

public class Test {

	public static void main(String[] args) {
		Chocolate arr[] = new Chocolate[6];
		
		Chocolate c1 = new Chocolate(12, "KitKat");
		Chocolate c2 = new Chocolate(18, "Twix");
		Chocolate c3 = new Chocolate(22, "Чио Рио");
		Chocolate c4 = new Chocolate(15, "Swatch");
		Chocolate c5 = new Chocolate(10, "Snickers");
		Chocolate c6 = new Chocolate(30, "Albeni");
		
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		arr[3]=c4;
		arr[4]=c5;
		arr[5]=c6;
		
//		Sort.bubbleSort(arr);
		Sort.mergeSort(arr, 0, 5);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
