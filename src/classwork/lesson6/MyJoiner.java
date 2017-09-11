package classwork.lesson6;

public class MyJoiner {

   public static String string;

    public static String add(String str){

        string = str + " |";
       // System.out.println(string.toCharArray());
        char []array=string.toCharArray();
        char ourArray[] = new char[array.length - 1];
        for (int i = 0; i <array.length ; i++) {
            if(string.endsWith("|")){

            }

        }
        string = ourArray.toString();
        System.out.println(ourArray.toString());
        return str;
    }

    public static void main(String[] args) {
        add("ПЕР");
    }
}
