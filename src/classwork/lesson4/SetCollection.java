package classwork.lesson4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);


        Iterator<Integer> iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(set.hashCode());
        }
    }
}
