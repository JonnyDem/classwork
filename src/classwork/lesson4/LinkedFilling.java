package classwork.lesson4;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class LinkedFilling {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        IntStream.rangeClosed(0,20).forEach(list::add);
        System.out.println(list);
        for(int i=0;i<list.size(); i++){
            if(list.get(i)%2==0){
                list.set(i,10);
            } else {
                list.set(i,20);
            }
        }
        System.out.println(list);
        for(Integer i=0;i<list.size(); i++){
            if(list.get(i)==20){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
