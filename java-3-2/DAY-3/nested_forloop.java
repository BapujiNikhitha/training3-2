
/*public class nested_forloop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
    */
//TASK:print 1-100 even numbers,tables upto 10
public class nested_forloop {
    public static void main(String[] args) {
        System.out.println("Even Numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nTables from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}