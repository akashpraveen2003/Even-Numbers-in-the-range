package even_numbers_in_the_range;

import java.util.ArrayList;
import java.util.Scanner;

/*
  You are given an array A of length N and Q queries given by the 2D array B of size Q×2.

	Each query consists of two integers B[i][0] and B[i][1].

	For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 */
public class Even_Numbers_in_the_range {

	private static Integer numbers_of_even_numbers_in_the_range(int[] array, int row, int column) {
		int count=0;
		for(int i=row;i<=column;i++)
		{
			if(array[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
	private static void find_even_numbers_in_the_range(int[] array, int[][] array_2d) {

		ArrayList<Integer> list=new ArrayList<>();
		int queries=0;
		while(queries<array_2d.length)
		{
			int row=array_2d[queries][0];
			int column=array_2d[queries][1];
			list.add(numbers_of_even_numbers_in_the_range(array,row,column));
			queries++;
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];		// 1d array
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		int row_size=scanner.nextInt();
		int array_2d[][]=new int[row_size][2];	// 2d array
		for(int i=0;i<row_size;i++)
		{
			for(int j=0;j<2;j++)
			{
				array_2d[i][j]=scanner.nextInt();
			}
		}
		find_even_numbers_in_the_range(array,array_2d);
	}

}
/*
  Input
	A = [1, 2, 3, 4, 5]
	B = [
		[0, 2] 
        [2, 4]
        [1, 4]
        ]

	Output
	[1,1,2]
	
	Input
	A = [2, 1, 8, 3, 9, 6]
	B = [
		[0, 3]
        [3, 5]
        [1, 3]
        [2, 4]
         ]

	Output
	[2,1,1,1]
*/
