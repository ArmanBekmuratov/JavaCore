package com.ArmanBekmuratov.javacore.chapter15;

public class MyArrayOps {
    static <T> int countMatching(T [] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v) count++;

            return count;
    }
}

class GenericMethodRefDemo {
    static <T> int myOp(MyFunc2 <T> f, T[] vals, T v) {
        return f.func(vals,v);
    }

    public static void main(String[] args) {
        Integer [] vals = {1,2,3,4,5,3,5,4,4,5};
        String [] strings = {"One", "Two", "Two", "One"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("массив vals содержит " + count + " числа 4" );
        count = myOp(MyArrayOps::countMatching, strings, "Two");
        System.out.println("массив strings содержит " + count + " слова 'Two'." );
    }
}
