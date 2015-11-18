package ostpc;

import java.util.Arrays;
public class Matrix {
	public static void main(String[] args) {
		int  array [][]= {{1, 2, 3, 4},
				          {5, 6, 7, 8},
				          {9, 10, 11, 12}};
		int secondMatrix [][] = {{1, 2, 3},
	                             {4, 5, 6},
	                             {7, 8, 9}};
		int otherMatrix[][] = {{3, 2, 1},
		                       {6, 5, 4},
		                       {9, 8, 7}};
		show(array);
		System.out.println("Транспортирование матрицы: ");
		transportation(secondMatrix);
		System.out.println("Умножение матрицы на число: ");
		multiply(secondMatrix);
		System.out.println("Сумма двух матриц: ");
		sum(secondMatrix, otherMatrix);
	}
		public static void show (int array [][]){
		 for(int i = 0;i < 3; i++){//round
	        	for(int j = 0; j < 4;j++){//line's cycle	        		
	        		  System.out.print(array[i][j] + "\t");
             }
	        	System.out.println();
		}
		}
		public static void transportation(int[][] secondMatrix){ 
  for(int i = 0; i < 3; i++){
	  for(int j = 0; j < 3; j++){
		  
		  System.out.print(secondMatrix[j][i] + "\t");
      }
     	System.out.println(); 
      }
		}	  
		public static void multiply(int [][] secondMatrix){
for(int i = 0; i < 3; i++){
   for(int j = 0; j < 3; j++){
	   secondMatrix[i][j]*=4;
	  System.out.print(secondMatrix[i][j] + "\t");
   }
  	System.out.println(); 	
}		
}          
	public static void sum(int [][] secondMatrix, int [][]otherMatrix){ 
	for(int i = 0; i < secondMatrix.length; i++){
	   for(int j = 0; j < otherMatrix.length; j++){     
		int third [][] = new int[3][3];
			  third[i][j] = secondMatrix[i][j] + otherMatrix[i][j];
		 System.out.print(third[i][j] + "\t");
			   }
			  	System.out.println(); 
		   }
		   }
	   

		}
