
//swapping of two numbers
//with temp variable
/*public class one {

public static void main(String[] args) {
    int a=10;
    int b =20;
    System.out.println("before swapping");
    System.out.println(a+"\t"+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("after swapping");
    System.out.println(a+"\t"+b);
}
}
*/

//without temp variable

/*public class one{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("bafore swapping");
        System.out.println(a+"\t"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping");
        System.out.println(a+"\t"+b);
    }
}
    */


   public class one{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("bafore swapping");
        System.out.println(a+"\t"+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("after swapping");
        System.out.println(a+"\t"+b);
    }
} 