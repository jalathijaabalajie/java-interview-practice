package Day4;

public class ReverseArray{
    public static void main(String[] args) {

        int[] rollno = {2, 6, 1, 5, 7, 3, 5};

        int start = 0;
        int end = rollno.length - 1;

        while (start < end) {
            int temp = rollno[start];
            rollno[start] = rollno[end];
            rollno[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < rollno.length; i++) {
            System.out.print(rollno[i] + " ");
        }
    }
}