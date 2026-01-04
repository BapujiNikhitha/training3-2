/* 
public class Three {
    public static int[] getArray() {
        int[] arr = {1,2,3,4,5};
        return arr;
    }
    public static void main(String[] args) {
        int[] result = getArray();
        for (int i :result) {
            System.out.print(i+" ");
            
        }
    }
    
}
*/

public class Three {
    public int[] number() {
        int[] arr = {1,2,3,4,5};
        return arr;
    }
    public static void main(String[] args) {
        Three t = new Three();
        int[] ar = t.number();
        for(int i:ar){
            System.out.println(i);
        }
    }
}





