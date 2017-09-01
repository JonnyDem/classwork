package classwork.lesson5.checkurl;

public class MainClass {
    public static void main(String[] args) {
        try {
            CheckSites.check("jhgjh");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
