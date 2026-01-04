
// public class Assignment_2 {
//     public int[]arr(int a, int b, int c, int d, int e){
//         int[] array = {1,2,3,4,5};
//         return array;

//     }
//     public static void main(String[] args) {
//         Assignment_2 ass = new Assignment_2();
//         int[] arr1 = ass.arr(3, 2, 3, 4, 5);
//         for(int i : arr1) {
//             System.out.println(i);
//         }
        
//     }
    
// }
public class Assignment_2 {
    public int[] add(int[] numbers) {
        return numbers;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        Assignment_2 a = new Assignment_2();
        int[] result = a.add(num);
        for(int i: result) {
            System.out.println(i+" ");
        }
    }
}
