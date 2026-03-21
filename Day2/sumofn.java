package Day2;

public class sumofn {
    public static void main(String[] args) {
        int n= 10;
        int sum =0;

        for(int i=1;i<=n;i++){
             sum += i;
        }
        System.out.println(sum);
    }
}


/* int n = 10;
int sum = n * (n + 1) / 2;
System.out.println(sum);

👉 This reduces:
Time complexity from O(n) → O(1) */