package com.mb.methodref;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppCall {
    public void func() {

        List<String> names = Arrays.asList("Ali", "Veli", "Osman");

        names.forEach(App::staticMethod);
        // veya
        App app=new App();
        names.forEach(app::nonStaticMethod);
        // veya
        names.forEach(System.out::println);
    }

    public Integer sirala(Integer o1, Integer o2){
        return o1 - o2;
    }

    public void func2(){
        List<Integer> numbers = Arrays.asList(5, 10, 1, 5, 6);
        Collections.sort(numbers, (o1, o2) -> o1 - o2);
        System.out.println(numbers);
    }

    public void func3(){

        List<Integer> numbers = Arrays.asList(5, 10, 1, 5, 6);
        Collections.sort(numbers, this::sirala);
        System.out.println(numbers);
    }
}
