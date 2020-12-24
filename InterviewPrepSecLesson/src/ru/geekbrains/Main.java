package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

//  Проверки методов:

//        myArrayList.add("Hello");
//        myArrayList.add("World");
//        myArrayList.add("!");
//        myArrayList.add("Hello");
//        System.out.println(myArrayList.size());
//        System.out.println(myArrayList.get(2));
//        myArrayList.clear();
//        myArrayList.add("new Rold");
//        myArrayList.add("HOHO");
//        myArrayList.add("LOLO");
//        myArrayList.add("JO");
//        System.out.println(myArrayList.size());
//        System.out.println(myArrayList.get(1));
//        System.out.println(myArrayList.get(3));
//        System.out.println(myArrayList.contains("HOHO"));
//        myArrayList.indexOf("HELLO");


        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");

        myArrayList.remove(2);
        System.out.println(myArrayList.size());
        myArrayList.remove(1);
        System.out.println(myArrayList.size());

    }
}
