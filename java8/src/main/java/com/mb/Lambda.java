package com.mb;

public class Lambda {

    public int calculate(Foo foo, int x, int y){
        return foo.apply(x,y);
    }

    public int sum(int a, int b){
        Foo foo = (x,y) -> (x+y);
        return foo.apply(a,b);
    }

    public int multiply(int a, int b){
        Foo foo = (x,y) -> (x*y);
        return foo.apply(a,b);
    }

    public void print() {

        /* Lambda expressions */
        System.out.println(sum(3,4));
        System.out.println(multiply(3,4));
        System.out.println(calculate( (x,y) -> (2*x+y) , 3, 4 ));
    }
}
