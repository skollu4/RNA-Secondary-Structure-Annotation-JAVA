/* Author: Shanthi Kollu
 * date: 6/28/2017
 * description: Count the number of helix loops (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;

import java.util.Scanner;

public class Helixlp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int length;
		 System.out.println("Enter the range of the sequence");
		 
		 length = input.nextInt();
		 
		 int []myValues = new int[length];
		 
		 int count =0;
		 
		 System.out.println("Enter the RNA sequence");
		 
		 //reading the input values to the array
		 for(int i=0; i<length; i++)
		 {
			 myValues[i] = input.nextInt();
			// System.out.println(myValues[i]);
				 
		 }
		 
		 input.close();
		 int x1, px1, x2, px2, y1, py1, y2, py2;
		 System.out.println("Positions of starting and ending elements are:");
		 
		 long startTime = System.nanoTime();
		 for(int i=0; i<length; i++)
		 {
	
			 if(myValues[i]>0)
			 {
				 x1 = myValues[i];
				 px1 = i;
				 
				while(myValues[i+1]==myValues[i]-2 && myValues[i+1]!=0)
				{
					
					i++;
				}
				 x2= myValues[i];
				 px2 = i;
				 
				i++;
				
				for(int j=i; j<length; j++)
				{
					while(j<length && myValues[j]!= -x2)
					{
						j++;
					}
				if(j<length)
				{
					y1 = myValues[j];
					py1 = j;
					
					while(myValues[j+1]==myValues[j]-2 && myValues[j+1]>= -x1)
					{
						if(j<length)
						j++;
					}
					
					y2 = myValues[j];
					py2 = j;
					j++;
					
					count++;
					 System.out.println("("+ px1 +","+ px2 + ") && ("+ py1 +"," + py2+ ")");
				}
			 }
			 } 
			
		 }
		 long endTime = System.nanoTime();
			
			long executionTime = endTime-startTime;
		 
		 System.out.println("HelixLoop count: "+ count);
		 System.out.println("Execution time:" + executionTime + "ns");

	}

}
