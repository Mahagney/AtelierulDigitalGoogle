package exceptions;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public int test(int i){
        try {
            System.out.println("Try ");
            exceptionalMethod(i);
            System.out.println("Try 2");
            throw new IOException();
//            return 0;
        }   catch(IOException e) {
            System.out.println("catch");
            return 1;
        }   catch(ClassCastException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("finally");
            return 2;
        }
    }

    private void exceptionalMethod(int i) {
        if(i >2)
            throw new ClassCastException();
    }

    public static void main(String[] args) {
        System.out.println((new Main()).test(5));
        System.out.println("args = ");
    }
}

// Try Try 2 catch finally  0 //Mara
//Try catch 1 //Andrei
