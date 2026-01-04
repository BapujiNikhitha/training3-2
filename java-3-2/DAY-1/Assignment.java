public class Assignment {
    public String returnStr(String s1, String s2) {
        String s3 = s1+" " +s2;
        return s3;
    }
    public static void main(String[] args) {
        Assignment a = new Assignment();
       String s= a.returnStr("Nikhitha", "Bapuji");
       System.out.println(s);
    }
    
}
