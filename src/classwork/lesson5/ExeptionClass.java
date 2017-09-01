package classwork.lesson5;

public class ExeptionClass {

    public static void main(String[] args) throws Exception {
        try{
            ErrorMethod();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Yes");
            System.out.println(e.getClass().getSimpleName());
        }finally {
            System.out.println("Final");
        }
    }
    public static void ErrorMethod() throws Exception{
        String[]array=new String[2];
        array[0]="1";
        array[1]="2";
        for (int i = 0; i <10 ; i++) {
            System.out.println(array[i]);
        }
    }
}
