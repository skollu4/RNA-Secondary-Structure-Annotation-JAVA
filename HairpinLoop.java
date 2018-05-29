/* Author: Shanthi Kollu
 * date: 5/24/2017
 * description: Count the number of hairpin loops (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;

import java.util.*;

public class HairpinLoop {

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
		 int value, q, j;
		 
		 System.out.println("Beg, End");
		 System.out.println("---------------");
		 
		 long startTime = System.nanoTime();
		 
		 //check the hairpin loop sequence i.e +X consecutive zeros -X (+X0000...-X)
		 for(int i=0; i<length; i++)
		 {
	
			 if(myValues[i]>0){
				 {
					 if(i<length)
					 {
						 if(myValues[i+1]==0){
								
				  value = myValues[i];
				   j =i;
				 //System.out.print(i);
				 i++;
				 
			 while(i<length && myValues[i]==0){
				 i++;
				 
			 }
			 q = myValues[i];
			 
			 
			 if(value==-q){
				 count++;
				 
				 System.out.println(j + " "+ i);
				 
			 }
				
				 }
			 } 
			 }
		 }
		 } 
		 long endTime =  System.nanoTime();
			
			long executionTime = endTime-startTime;
			
		 System.out.print("Sequence match count: ");
		 System.out.println(count);
		 System.out.println("Execution Time: "+ executionTime +"ns");
		 
		 }
	
	
	
	

	}


