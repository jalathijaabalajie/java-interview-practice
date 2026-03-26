package Day4;


import java.util.Scanner;

public class linearSearch{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter array size: ");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    
	    System.out.print("Enter elements: ");
	    for(int i =0; i<size; i++){
	       arr[i] = sc.nextInt();
        }
	    
        System.out.print("Enter the value to check: ");
	    int x = sc.nextInt();

	    for(int i=0;i<size; i++){
	        if(arr[i] == x){
	            System.out.print(i);
                sc.close();
	            return;
	        }
        }
	    }
	    }

