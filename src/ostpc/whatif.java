package ostpc;



public class whatif {
	private static boolean primeCheck(int a) {
		boolean c = true;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && a != i && i != 1) {
				c = false;
				break;
			}
			if (a % i != 0 && a == i) {
				c = true;
				break;
			}
		}
		return c;
	}

	
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for (int i = 0, j = 1, k = 1; i < 100; j++) {
			if (primeCheck(j)) {
				arr[i] = j;
				System.out.println("m[" + k + "]=" + arr[i]);
				i++;
				k++;
			} 
		}
	}
}