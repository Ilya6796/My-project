package ostpc;

public class fibonacci {
	public static void main(String[] args) {
		

		int [] array = new int[20];
		array[0] = 1;
		array[1] = 1;
		System.out.println("array[0]=" + array[0]+"\na[1]="+ array[1]);
		for(int i=2,j=1;i<20;i++)
		{
			j=i-1;
			array[i] = array[j-1] + array[j];
			System.out.println("array["+i+"]="+array[i]);
		}
}
}