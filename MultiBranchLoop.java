/* Author: Shanthi Kollu
 * date: 8/15/2017
 * description: Count the number of multi-branch loops (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;
import java.util.Scanner;

public class MultiBranchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int length;
		System.out.println("Enter the range of sequence");
		length = input.nextInt();
		int[] A = new int[length];
		
		System.out.println("Enter the input sequence");
		
		for(int i=0; i<length; i++)
		{
			A[i]=input.nextInt();
		}
		
		input.close();
		System.out.println("Beg & End positions are:");
		
		int count = 0;
		
		long startTime = System.nanoTime();
		
		for(int i=0; i<length; i++)
		{
			if(A[i]>0) 
				{
					int x1= A[i];
					int y1 = i;
					i++;
					
					while(i<length && A[i]!=-x1)
						{
							i++;
						}
					int y2 = i;
					if(i<length && A[i+1]==0)
						{
							i++;
							while(i<length && A[i]==0)
								{
									i++;
								}
							count = count+1;
							System.out.println(y1 + " " + y2);
						}
				}
		}
		
		long endTime = System.nanoTime();
		
		long executionTime = endTime-startTime;
		
		
		System.out.println("count is " + count);
		System.out.println("Execution time: "+ executionTime +"ns");
		
	}

}
