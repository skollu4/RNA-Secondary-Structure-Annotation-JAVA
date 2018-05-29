/* Author: Shanthi Kollu
 * date: 6/24/2017
 * description: Count the number of bulge loops (substructure) present in the given RNA 
 * secondary structures (2D) and identify those structure positions.
 */
package subStructures;
import java.util.Scanner;

public class BulgeLoop {

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
			//System.out.println(i + " " + a[i]);
		}
		
		input.close();
		
		System.out.println("Beg, End");
		System.out.println("----------");
		
		int x1, x2, px1, px2, y1, y2, py1, py2, a1, a2, b1, b2, c1, c2, pb1, pc2;
		
		long startTime = System.nanoTime();
		
		for(int i =0; i<length; i++)
		{
			if(a[i]>0){
				if( i<length){
				x1 = a[i];
				px1 = i;
				
				i++;
				
				
				for(int j= i+1; j<length; j++){
					if(a[j]<0 && a[j]==-x1 && j<length){
					
						if(j<length) {
							
						
						if(a[j+1]==0){
							x2=a[j];
							px2 = j;
							//System.out.println("x2 value is " + x2);
							j++;
							while(j<length && a[j]==0){
								j++;
							}
							
				
					if(j<length && a[j]<0){
							if(j<length){
						if(a[j]!=x2){
					
						
					y1 = a[j];
					py1 = j;
					
					j++;
					
			for(int k = j+1; k<length; k++){
				
				if(a[k]== -y1)
				{
					if(k<length){
						y2 = a[k];
						py2 = k;
		/*System.out.println("x1 value is " + x1);
		System.out.println("x2 value is " + x2);
		System.out.println("y1 value is " + y1);
		System.out.println("y2 value is " + y2);*/
						
						
		System.out.println(px1 + " " + py2);
						count++;
					
				}
				
				}
			}
				}
				}
						}
					}
					}
				}
				
				/*while(i<length && a[i]!=-x1){ 
					i++;
				}*/
				
				/*for(int j = i+1; j<length; j++){
					if(j<length && a[j]==-x1){
						x2 = a[j];
						
						if(j< length && a[j+1]==0 ){
							j++;
							
							while(a[j]==0 && j<length){
								j++;
							}
						
							
							if(a[j]!= x2 && a[j]<0 && j<length){
								
								y1 = a[j];
								
								//count++;
								
								System.out.println("x1 value is " + x1);
								System.out.println("x1 value is " + x2);
							
								System.out.println("y1 value is " + y1);

								for( int k =j+1; k<length; k++){
									
									if(a[k]>0 && k<length){
										if(a[k]==-y1){
											y2 = a[k];
											
											count++;
										}
									}
									
								}
								
							
							}
						}
					}
				}
				*/
				
					
				
			/*	x2 = a[i];
				px2 = i;
				System.out.println("x2 value is " + x2 + " " + px2);
				
				if(i<length && a[i+1]==0)
				{
					i++;
					while(i<length && a[i]==0)
						i++;
					
				
				if(a[i]>0 && a[i]!=x2 && i<length)
				{
					y1 = a[i];
					py1 =i;
					System.out.println("y1 value is " + y1 + " " + py1);
					i++;
					
					while(a[i]!=-y1)
						i++;
					y2 = a[i];
					py2 = i;
					
					System.out.println("y2 value is " + y2 + " " + py2);
					
					count++;
					
				
				}
				
				}*/
				}
				}
			}
		}
		//}
		
	/*for(int l=0; l<length; l++){
			if(a[l]>0 ){
				 if(l<length){
					 if(a[l+1]==0 && l<length){
						 
					 a1= a[l];
					 l++;
					 
					 while(l<length && a[l]==0){
						 l++;
					 }
					 
					 if(l<length && a[l]!=a1 ){
						 if(a[l]>0){
							 
							 b1 = a[l];
							 l++;
							 
							 for( int m = l+1; m<length; m++){
								 if(a[m]== -b1 && m<length){
									 b2 = a[m];
									 
									 System.out.println("a1 value is " + a1);
									 
									 System.out.println("b1 value is " + b1);
									 System.out.println("b2 value is " + b2);
									 
									 count++;
								 }
							 }
						 }
							 
					 }
					 
					 
														 }
													 }
												 }
							
		}*/
		
		for(int i =0; i<length; i++){
			 if(a[i]<0){
				 if(i<length){
					 if(a[i+1]==0 && i<length){
						 b1 = a[i];
						 pb1 = i;
						 
						 i++;
						 
						 while(i<length && a[i]==0){
							 i++;
						 }
						 
						 if( i<length && a[i]<0){
		 					 if(a[i]!= b1){
								 c1 = a[i];
								 i++;
								 
								 for(int j = i+1; j<length; j++){
									 if(a[j]==-c1){
										 if(j<length){
											 
												 c2 = a[j];
												 pc2 = j;
												 
												 /*System.out.println("x1 value is " + b1);
												 System.out.println("y1 value is " + c1);
												 System.out.println("y2 value is " + c2);*/
												 
												 System.out.println(pb1 + " " + pc2);
												 
												 count++;
											 
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
		System.out.println("sequence match count is " + count);
		
		System.out.println("Execution Time: "+ executionTime +"ns");

	}



	}


