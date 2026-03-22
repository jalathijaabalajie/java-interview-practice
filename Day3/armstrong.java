    package Day3;

    public class armstrong {
    public static void main(String[] args) {
        {
            int num = 1634;
            int temp = num;
            int count = 0;
            int sum=0;
            
            while(temp>0){
            temp = temp/10;  //153/10=15  15/10=1   1/10=0   0!=0 condition fails
            count++;           //1           2         3
            }

            temp = num;         //153
            while(temp!=0){     //153!=0       15!=0   1!=0      0=0(EXIT LOOP)
                int rem = temp%10;  //rem=3    rem=5    rem=1
                sum = sum + (int)Math.pow(rem, count);  //sum =0+(3^3)=27   sum=27+125=152   sum=152=1=153
                temp = temp/10;   //temp=153/10=15    15/10=1    1/10=0
            }

            if(num==sum){
                System.out.println("Armstrong");
            }
            else{
            System.out.println("not an Armstrong");
            }
    }
    }
    }
