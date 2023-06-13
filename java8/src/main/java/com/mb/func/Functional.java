package com.mb.func;

import com.mb.func.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Functional {

    public void func() {
        Consumer<String> consumer = (String msg) -> {
            System.out.println(msg);
        };

        consumer.accept("Merhaba!");
    }

    public void func2() {
        Consumer<String> consumer = (msg) -> {
            System.out.println(msg);
        };
        consumer.accept("Merhaba Dünya");
    }

    public void func3() {
        Consumer<String> consumer = e -> {
            System.out.println(e);
        };
        consumer.accept("Hello World!");
    }

    public void func4() {

        List<String> names = Arrays.asList("Ali", "Veli", "Murat");

        names.forEach( e -> {System.out.println(e);});


    }

    public void func5() {

        Consumer<String> consumer = App::listele;

        consumer.accept("Merhaba");

    }

    public void func6() {

        List<String> names = Arrays.asList("Ali", "Veli", "Murat");

        names.forEach(App::listele);
        names.forEach(System.out::println);

    }

    public void func7() {

        BiConsumer<String, Integer>  biConsumer = (name, age) -> {

            System.out.println(name + " " + age);
        };

        biConsumer.accept("Muhammed", 14);


    }

    public void func8() {

        Function<Double, Double> function = t -> Math.pow(t, 2);

        Double result = function.apply(5.0);

        System.out.println(result);

    }

    public void func9() {

        UnaryOperator<Double> function = t -> Math.pow(t, 2);

        Double result = function.apply(5.0);

        System.out.println(result);

    }

    public void func10() {

        BiFunction<Double, Double, String> function = (a,b) -> "Sonuç : " + (a+b);

        String result = function.apply(3.0,4.0);

        System.out.println(result);

    }
    public void func11() {

        BinaryOperator<Double> function = (a,b) -> (a+b);

        Double result = function.apply(3.0,4.0);

        System.out.println(result);

    }
    public void func12() {

        Predicate<Integer> predicate = a -> (a>0);

        Boolean pos = predicate.test(5);
        Boolean neg = predicate.test(-5);

        System.out.println(pos);

    }
    public void func13() {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a>b);

        Boolean pos = biPredicate.test(5, 4);

        System.out.println(pos);

    }
    public void func14() {

        Supplier<List> supplier = () -> new ArrayList<>();
        List<String> liste = supplier.get();
        liste.add("Ali");
        liste.add("Veli");
        liste.add("Osman");

        System.out.println(liste);

    }

}