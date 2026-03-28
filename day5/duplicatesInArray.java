package Day5;

import java.util.HashSet;
import java.util.Set;

public class duplicatesInArray {
    
    public static void main(String[] args) {
        
        int[] arr = {2,2,6,4,7};

        Set<Integer> uniqueuNumber = new HashSet<>();
        boolean isDuplicateExist = false;

        for(int i=0; i<arr.length;i++){
            if(uniqueuNumber.contains(arr[i])){
                isDuplicateExist = true;
                System.out.print( arr[i] + " " );
            }
            else{
                uniqueuNumber.add(arr[i]);
            }            
        } 
        if(!isDuplicateExist){
            System.out.println(-1);
    }
}
}
