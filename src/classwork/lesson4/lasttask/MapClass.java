package classwork.lesson4.lasttask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapClass {

    public static void main(String[] args) {

        new MapClass().sortList(new MapClass().buildList());
    }

    public Map buildList(){
        Map<Integer,Object> allList=new HashMap<>();
        for (int i = 1; i <=20 ; i++) {
            if(i<11){
                allList.put(i,new User());
            } else {
                allList.put(i,new Project());
            }
        }
        System.out.println(allList.entrySet());
        return allList;
    }
    public void sortList(Map list){
        List<User> user=new ArrayList<>();
        List<Project> project=new ArrayList<>();
        int count=1;
        for (Object o:list.values()) {
            if (o instanceof User) {
                user.add((User) o);
                ((User) o).name="Bill "+count;
                ((User) o).age=20+count++;
            } else {
                project.add((Project)o);
                ((Project) o).startData="June "+count++;
            }
        }
        for(User u:user) {
            System.out.println("name: "+u.name+", age: "+u.age);
        }
        for(Project p:project){
            System.out.println(p.startData);
        }
    }
}
