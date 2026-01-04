public class One {
    public byte smallNum(){
        byte b = 1;
        return b;
    }
    public static void main(String[] args) {
        One o = new One();
        byte b1 = o.smallNum();
        System.out.println(b1);
    }
}