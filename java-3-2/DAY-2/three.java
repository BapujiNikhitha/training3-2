
//ArmStrong number
public class three {
    public static void main(String[] args) {
        int number=153;
        int sum=0;
        int temp=number;
        while(number!=0){
            int digit=number%10;
            sum=sum+digit*digit*digit;
            number=number/10;
        }
        if(temp==sum){
            System.out.println("is a armstrong number");
        }
        else{
            System.out.println(" is not a armstrong number");
        }
    }
}
