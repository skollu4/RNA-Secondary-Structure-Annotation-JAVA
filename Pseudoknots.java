/* Author: Shanthi Kollu
 * date: 8/30/2017
 * description: Count the number of pseudoknots (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;

import java.util.*;

public class Pseudoknots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int length;
		 System.out.println("Enter the range of the sequence");
		 
		 length = input.nextInt();
		 
		 int []A = new int[length];
		 
		 System.out.println("Enter the RNA sequence");
		 
		 for(int i=0; i<length; i++)
		 {
			 A[i] = input.nextInt();
				 
		 }
		 
		 input.close();
		 int count =0;
		 
		 int x1, x2, y1, y2, z1, z2, w1, w2;
		 
		 System.out.println("Beg, End values are:");
		 
		 long startTime = System.nanoTime();
		 
		 for(int i=0; i<length; i++)
		 	{
			 	if(A[i]>0)
			 		{
			 			x1 = A[i];
			 			y1 = i;
			 			i++;
			 			
			 			for(int j =i; j<length; j++)
			 				{
			 					if(A[j]<0 && A[j]==-x1)
			 						{
			 							x2 = A[j];
			 							y2 = j;
	
			 							
			 				
			 							for(int k =i; k<length; k++)
			 								{
			 									if(A[k]>0 && k<y2)
			 										{
			 											z1 = A[k];
			 											w1 = k;
			 											k++;
			 										
			 											while(A[k]!=-z1 && k<length)
			 												{
			 													k++;
			 												}
			 											if(A[k]==-z1 && k>y2)
			 											{
			 												z2 = A[k];
			 												w2 = k;
			 												count = count+1;
	System.out.println("1st pairing: " + "("+ x1 +","+y1+")"+"," +"("+ x2 +","+y2+")");
	System.out.println("2nd pairing: " + "("+ z1 +","+w1+")"+"," +"("+ z2 +","+w2+")");
			 											}
	
			 										}
			 								}
			 						}
			 				}
			 		}
			 	
		 	}
	long endTime = System.nanoTime();
	
	long executionTime = endTime-startTime;
	
	System.out.println("No of Pseudoknots in the given sequence is: "+count);
	
	System.out.println("Execution time: "+ executionTime +"ns");
	
	}
	}
