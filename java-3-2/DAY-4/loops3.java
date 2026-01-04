/* 
public class loops3 {
    public static void main(String[] args) {
        int age=-1;
        while(age<0){
            System.out.println("Enter valid age: ");
            java.util.Scanner sc=new java.util.Scanner(System.in);
            age=sc.nextInt();
        }
        System.out.println("You Entered valid age");
    }

}
*/


//pattern generator ,right triangle of stars.pyramid patterns number patterns(1,12,123....)inverted patterns
//diamond pattern challenge advanced pascal triangle floyd's triangle code optimization for patterns

/* 
//Right Triangle – Star Pattern
public class loops3 {
    public static void main(String[] args) {
int n = 4;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
    }
}

*/

/* 
//Number Pattern (1, 12, 123…)*
public class loops3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
*/

/* 
//Pyramid – Star Pattern
public class loops3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/


/* 
//Inverted Right Triangle – Star Pattern
public class loops3 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
    for(int s=1;s<=5-i;s++)
        System.out.print(" ");
    for(int j=1;j<=i;j++)
        System.out.print("* ");
    System.out.println();
}

    }
}
*/

/* 
//Diamond Pattern – Star Pattern
public class loops3 {
    public static void main(String[] args) {
        int n = 5;
        // Upper half of diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/* 
//Floyd's Triangle
public class loops3 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
    */

/* 
   //Code Optimization for Patterns (Right Triangle – Star Pattern)
public class loops3 {   
    public static void main(String[] args) {
        int n = 4;
        StringBuilder pattern = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            pattern.append("* ");
            System.out.println(pattern.toString());
        }
    }
}
*/