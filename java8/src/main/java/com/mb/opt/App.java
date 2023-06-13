package com.mb.opt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class App {

    public void func() {

        Optional<Double> empty = Optional.empty();
        Optional<String> of = Optional.of("Merhaba Dünya");
        Optional<Integer> ofNullable = Optional.ofNullable(null);// null kabul eder exception atmaz

        if(ofNullable.isEmpty())
            System.out.println("of nullable null");

        Optional<String> ofNull = Optional.of(null);// null kabul etmez exception atar

        if(ofNull.isEmpty())
            System.out.println("of nullable null");

    }


    public void func2() {

        Integer numara = null;
        Optional<Integer> opt = Optional.ofNullable(numara);
        opt.ifPresent(num -> {
            Double karesi = Math.pow(num , 2);
            System.out.println("Sonuç: " + karesi);
        });


    }

    public void func3() {

        Integer numara = null;
        Optional<Integer> opt = Optional.ofNullable(numara);
        opt.map(num-> Math.pow(num, 2)).ifPresent(System.out::println);


    }

    public void func4() {

        String message = null;
        Optional<String> opt = Optional.ofNullable(message);
        opt.filter(m-> m.length() > 5).ifPresent(System.out::println);


    }

    public void func5() {

        Integer message = null;
        Optional<Integer> opt = Optional.ofNullable(message);
        int result = opt.orElse(0);

        System.out.println(result);
    }

    public void func6() {

        List<String> names = Arrays.asList("Ali", "Veli", "Osman");
        Optional<List<String>> opt = Optional.ofNullable(names);
        names = opt.orElseGet(() -> new ArrayList<>());
        names = opt.orElseGet(ArrayList::new);



    }

    public void func7() {
        Integer numara = 2;
        Optional<Integer> opt = Optional.ofNullable(numara);
        int result = opt.orElseThrow(NullPointerException::new);
        System.out.println(result);
    }
}
