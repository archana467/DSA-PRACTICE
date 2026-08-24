import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		//pattern 
		//Square and rectangle 
		
		int n=5;
		int m=5;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print("*");
		        
		    }
		    System.out.println();
		}
		//left (right angle triangle)
		for(int i=0;i<n;i++){
		    for(int j=0;j<i;j++){
		        System.out.print("*");
		        
		    }
		    System.out.println();
		}
		////right (right angle triangle)
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if((i+j)>=n-1){
		              System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		       
		      
		        
		    }
		    System.out.println();
		}
		//inverted left (right angle triangle)
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if((i+j)<=n-1){
		              System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		       
		      
		        
		    }
		    System.out.println();
		}
		// inverted right (right angle triangle)
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(i<=j){
		              System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		       
		      
		        
		    }
		    System.out.println();
		}
		
		
		//pyramid 
		System.out.println("Pyramid");
		for(int i=0;i<n;i++){
		    for(int j=0;j<((2*n)-1);j++){
		      if((i+j)>=n-1 && (j-i)<=n-1)  {
		           System.out.print("*");
		      }
		       else{
		            System.out.print(" ");
		        }
		      
		    }
		    System.out.println();
		}
		//inverted Pyramid
		System.out.println("Inverted");
		for(int i=0;i<n;i++){
		    for(int j=0;j<((2*n)-1);j++){
		      if(i<=j && (i+j)<=((2*n)-2))  {
		           System.out.print("*");
		      }
		       else{
		            System.out.print(" ");
		        }
		      
		    }
		    System.out.println();
		}
		//left side of triangle 
				
		for(int i=0;i<((2*n)-1);i++){
		    for(int j=0;j<n;j++){
		      if(i>=j && (i+j)<=((2*n)-2))  {
		           System.out.print("*");
		      }
		       else{
		            System.out.print(" ");
		        }
		      
		    }
		    System.out.println();
		}
		//right side of the  triangle
		for(int i=0;i<((2*n)-1);i++){
		    for(int j=0;j<n;j++){
		      if((i+j)>=n-1 && (i-j)<=n-1) {
		           System.out.print("*");
		      }
		       else{
		            System.out.print(" ");
		        }
		      
		    }
		    System.out.println();
		}
		//Butterfly 
		for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if((i>=j && (i+j)<=n-1) || (i<=j && (i+j)>=n-1) ){
             
                    System.out.print("*");  
                
              
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
		
		
		
		
		
		
		
		
		
		
       
	}
}
