package classwork.lesson4;

import java.util.*;

public class InstanceOfClass {

    public static void main(String[] args) {

        new InstanceOfClass().showTo(new InstanceOfClass().buildList());
        {

        }
    }
    public List buildList(){
        List list=new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
            list.add("Hello");
        }
        System.out.println(list);
        return list;
    }


    public void showTo(List list){
        List list2=new LinkedList<>();
        List list3=new LinkedList<>();
        for(Object o:list){
            if(o instanceof Integer){
                list2.add(o);
            }else{
                list3.add(o);
            }
        }
        System.out.println(list2);
        System.out.println(list3);
    }
}
