package ostpc;

public class Try {

	public static void main(String[] args) {
		int array [][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
int other [][] = {{3, 2, 1},
		          {6, 5, 4},
		          {9, 8, 7}};

for(int i = 0; i < array.length; i++){
for(int j = 0; j < array[i].length; j++){  
  for(int a = 0; a < other.length; a++){
	   for(int b = 0; b < other[a].length; b++){ 
int third [][] = new int[3][3];
  for(int d = 0; d < third.length; d++){
	   for(int e = 0; e < third[d].length; e++){ 
third [d][e] = array[i][j] + other[a][b]; 
System.out.print(third [d][e] + "\t");
	   }
	  	System.out.println(); 
  }}}

}}}}
