package mainsrc;

import java.util.Arrays;

public class IntArray {

    private final int DEFAULT_CAPACITY=5;

    private int[] elements;
    private int size=0;

    public IntArray() {
        elements=new int[DEFAULT_CAPACITY];
    }

    public void add (int element){
        if (size==elements.length){
//            int[] temp=new int[elements.length*2];
//            System.arraycopy(elements,0,temp,0,elements.length);
//            elements=temp;
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public int get(int index){

        return elements[index];
    }
    public int size() {
        return size;
    }

    public void ensureCapacity(){
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }
}
