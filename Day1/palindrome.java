package Day1;
public class palindrome {
    public static void main(String[] args) {
        int given = 121;
        int num = given;  //copy variable
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        System.out.println("reverse " + rev);

        if (given == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
