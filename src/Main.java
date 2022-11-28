import java.util.Arrays;

public class Main {
    public static Integer sum(Integer a, Integer b){
        System.out.println(a.getClass());
        return a + b;
    }

    public static void main(String[] args) {
//        String a = "abc";
//        String b = "abc";
//        if(a==b){
//            System.out.println("a=b");
//        }
//
//        String c = new String("abc");
//        String d = new String("abc");
//        if(c==d){
//            System.out.println("c=d");
//        } else {
//            System.out.println("c!=d");
//
//        }

        int a = 3;
        Integer c = new Integer(a);
        int d = c.intValue();
        //Autoboxing
        System.out.println("sum = " + sum(a,5));
    }
}
