package test;

import java.util.*;



public class aaa<T> {


    private T[] array;
    private int size = 0;
    public aaa(int size){
        array = (T[])new Object[size];
    }

    public void set(int index, T value){
        array[index] = value;
        size++;
    }


    public T get (int index){
        return array[index];

    }

    public T[] getArray(){
        return array;
    }

    public int size(){
        return size;
    }

}


