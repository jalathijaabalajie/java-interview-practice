package Day1;
public class largest3nos {
    public static void main(String[] args) {
        
        int a = 1;
        int b =20;
        int c = 10;

        if (a>b && a>c){
            System.out.println("a is largest");
        } else if (b>a && b>c){
            System.out.println("b is largest");
        }else if(c>a && c>b){
            System.out.println("c is largest");
        }
        else{
            System.out.println("Provide 3 different numbers");
        }

    }
}
