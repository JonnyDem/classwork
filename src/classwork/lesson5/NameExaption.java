package classwork.lesson5;

public class NameExaption {
    public static void main(String[] args) {
        String name="Alex";
        check(name);
        try {
            name = null;
            check(name);
        }catch (NullPointerException e){
            System.out.println("Name is upsent");
        }
    }

    static  void check(String name) {
        if(name.equals("Vanya")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
