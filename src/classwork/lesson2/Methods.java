package classwork.lesson2;

import java.util.Arrays;

public class Methods {
    int value;
    static String str;



    public static void main(String[] args) {
        int[]array=new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i]=i;
        }
        int[]array2={1,2,3,4,5,6,7,8,9,10};
        showArray(array);
        showArray(array2);
    }
    private static void showArray(int[]array) {
        System.out.println(Arrays.toString(array));
    }

   public void String(){
        System.out.println("void String");
    }

    public int value(int value){
       this.value=value;
       return this.value;
    }
    public static String str(String string){
        str=string;
        return str;
    }



}
