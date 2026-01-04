//palindrome
public class two {
    public static void main(String[] args) {
        int num=131;
        int rev=0;
        int temp=num;
        while (num >0){
            int digit=num%10;  //3
            rev=rev*10+digit; //0+3
            num=num/10;         //33443
        }
        if(temp==rev){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }    
}
