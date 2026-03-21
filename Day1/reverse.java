public class reverse {
    public static void main(String[] args) {
        int num = 23;
        int rev = 0;

        while(num!=0){
        int digit = num % 10;
        num = num/10;
        rev = rev * 10 + digit;  
        }
        System.out.println(rev);
    }
}

//What happens when number ends with 0?
//Trailing zeros are lost because integers don’t store leading zeros.”
