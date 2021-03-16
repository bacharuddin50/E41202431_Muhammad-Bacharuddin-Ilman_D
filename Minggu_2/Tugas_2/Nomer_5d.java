package nomer_5d;
public class Nomer_5d {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "DEF";
        String s3 = "AB" + "C";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1);
    }
    
}
