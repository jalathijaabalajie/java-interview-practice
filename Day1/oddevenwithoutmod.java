package Day1;
public class oddevenwithoutmod {
    public static void main(String[] args) {
        int num = 10;

        if((num&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}

// other method:
// if(num/2)*2 == num; --> even 
// else odd 
