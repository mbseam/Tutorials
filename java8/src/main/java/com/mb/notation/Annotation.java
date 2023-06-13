package com.mb.notation;

/*
    TYPE                Sınıf, arayüz, soyut sınıf başlarına
    METHOD              Metod başlarına
    FIELD               Global alan başlarına
    PARAMETER           Metod parametrelerine
    CONSTRUCTOR         Constructor başına
    ANNOTATION_TYPE     Notasyonların başına
    PACKAGE             Paket deklarasyonu başına
*/

/*
    SOURCE              Notasyonlar derleme zamanında yok sayılır.
    CLASS               Notasyonlar derleme zamanında sınıf içerisinde bulundurulur, fakat çalışma zamanında bulunması zorunlu değildir. Varsayılan hal budur.
    RUNTIME             Notasyonlar çalışma zamanında erişilmek üzere sınıf içerisinde bulundurulur.Çalışma zamanında erişim Java Reflection API ile yapılır. Sık kullanılan hal budur.
*/


public class Annotation {

    public void func1() {

        Class<AppMultiple> app = AppMultiple.class;
        Single[] notz = app.getAnnotationsByType(Single.class);
        for (Single not : notz) {
            System.out.println(not.value());
            // Merhaba
            // Uranüs
        }

    }

    public void func2() {

        Class<App> app = App.class;
        Single[] notz = app.getAnnotationsByType(Single.class);
        for (Single not : notz) {
            System.out.println(not.value());
            // Merhaba
            // Uranüs
        }

    }
}
