package classwork.lesson5;

import java.util.Scanner;

public class ScanerClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string");
        String string=scan.nextLine();
        try{
            int x=Integer.valueOf(string);
        } catch(RuntimeException e){
            System.out.println("Error");
        } finally {
            scan.close();
            System.out.println("Scanner is closed");
        }
    }
}
