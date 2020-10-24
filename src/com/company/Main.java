package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"1", "2", "3"};
        swapElemArr(strings, 1,2);
        for (int i = 0; i < strings.length; i++) {
           System.out.println(strings[i]);
        }

        ArrayList list = toList(strings);

        System.out.println(list.getClass());
        System.out.println(list);
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple(), 15);
        appleBox2.addFruit(new Apple(), 10);
        orangeBox.addFruit(new Orange(), 10);
//        appleBox1.addFromBox(orangeBox);
//        appleBox1.addFruit(new Orange(), 10);
//        System.out.println(appleBox1.compare(orangeBox1));
//        System.out.println(appleBox1.getWeight());

    }

    public static void swapElemArr(Object[] arr, int i, int j) {
        Object elem = arr[i];
        arr[i] = arr[j];
        arr[j] = elem;
    }

    public static <T> ArrayList toList(T[] arr){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}

