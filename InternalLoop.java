/* Author: Shanthi Kollu
 * date: 5/30/2017
 * description: Count the number of internal loops (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;
import java.util.Scanner;

public class InternalLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int length;
		System.out.println("Enter the Range of the sequence");
		length = input.nextInt();
		
		int[] a = new int[length];
		int count = 0;
		
		System.out.println("Enter the RNA sequence");
		
		
		for(int i=0; i<length; i++)
		{
			a[i] = input.nextInt();
		}
		
		input.close();
		
		int y1, y2, x1, x2, py1, px1, px2, py2;
		
		System.out.println("Beg, End");
		System.out.println("--------------");
		
		 long startTime = System.nanoTime();
		
		// check for the pattern or sequence i.e +X0000+Y anything -Y0000-X
		for(int i =0; i<length; i++ )
		{
			if(a[i]>0){
				if(i<length){
					if(a[i+1]==0){
						y1 = a[i];
						py1 = i;
						//System.out.println("y1 value is " + y1);
						
						i++;
						
						while(i<length && a[i]==0){
							i++;
							
						}
						
							
						if(i<length){
							if(a[i]>0 && a[i]!=y1){
								x1 = a[i];
								px1 = i;
								//System.out.println("x1 value is " + x1);
								i++;
								
								/*while(i<length && a[i]!=-x1){
									i++;
								}
								*/
								//if(a[i]==-x1){
								for(int j=0; j<length; j++){
									if(a[j]<0 && a[j]==-x1){
									if(j<length){
										if(a[j+1]==0){
											x2=a[j];
											px2 = j;
											//System.out.println("x2 value is " + x2);
											j++;
											while(j<length && a[j]==0){
												j++;
											}
											
								if(a[j]==-y1){
									count++;
									y2 = a[j];
									py2 = j;
									//System.out.println();
									//System.out.println("y1 & x1 values are  " + y1 + " "+ x1);
									//System.out.println("x2 & y2 values are  " + x2 + " "+ y2);
									//System.out.println("Beg, End");
									//System.out.println("--------------");
									System.out.println(py1 +" "+ py2);
									
								}
										
									
										}
									}
						
								}
								
							}
						}
						
						}
						
					}
				}
			}
						
		}	
		
		long endTime = System.nanoTime();
		
		long executionTime = endTime-startTime;
		
		
		System.out.println();
		System.out.println("Sequence match count is: " + count);
		
		System.out.println("Execution Time: "+ executionTime +"ns");

		

	}
}