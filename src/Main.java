import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        if(a==b){
            System.out.println("a=b");
        }

        String c = new String("abc");
        String d = new String("abc");
        if(c==d){
            System.out.println("c=d");
        } else {
            System.out.println("c!=d");

        }
    }
}
