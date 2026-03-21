package Day1;
public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;

        a = a + b;  //110
        b= a - b;
        a= a - b;

        System.out.println("a = " +  a);
        System.out.println("b = " + b);
    }
}

/*Why can Method 1 fail for large numbers?

Because of integer overflow ⚠️
🧠 What is overflow?
Java int has a limit:

Min: -2,147,483,648
Max: 2,147,483,647

If you do
a = a + b;
and the result exceeds this limit → wrong value (wrap-around happens) */
