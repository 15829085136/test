package practice02;


/*Êý×ÖÐý×ª·½Õó
 */
public class Homework { 
	    public static int N = 6;  
	    int [][] result = new int[N][N];  
	    public static void main(String[] args) {  
	        Homework homework=new Homework();  
	        homework.math(1, 0, N);  
	        homework.printResult();  
	    }  
	      
	    
	    public void math(int number, int begin, int size){  
	        if(size == 1){  
	            result[begin][begin] = number;  
	            return;  
	        }  
	          
	        if(size == 0){  
	            return;  
	        }  
	   
	        int i = begin;  
	        int j = begin;  
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            i++;  
	        }  
	          
	         
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            j++;  
	        }  
	          
	         
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            i--;  
	        }  
	          
	          
	        for(int k = 0; k < size - 1; k++){  
	            result[i][j] = number;  
	            number++;  
	            j--;  
	        }  
	          
	       
	        math(number, begin + 1, size - 2);  
	    }  
	      
	    
	    public void printResult(){  
	        for(int i = 0; i < N; i++){  
	            for(int j = 0; j < N; j++){  
	                System.out.print(result[i][j] + "   ");  
	                if(j == N - 1){  
	                    System.out.println();  
	                }  
	            }  
	        }  
	    }  
}
