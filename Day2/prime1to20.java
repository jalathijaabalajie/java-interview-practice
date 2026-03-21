package Day2;

public class prime1to20 {
    public static void main(String[] args) {
        int n = 20;
    
        for(int i = 2; i<=n;i++){    
            boolean isprime = true;                               //iterate from 2 to 20
            for( int j = 2; j<i;j++){     //iterate from 2 to i-1 if i=20, 
            //j iterates till 19, but when it finds a divisor it stops
            if(i%j==0){        //20%2 == 0; not a prime
                isprime = false;
                break;         
              } 
             } //stop checking this number
             if (isprime){
                System.out.println(i );
             }
        }
    }
}

