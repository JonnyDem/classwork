package classwork.lesson4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <=10 ; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();

            if(next%2==0) {
                System.out.println(next);
            }
       }
    }
}
