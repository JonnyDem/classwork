package classwork.lesson5.checkurl;

import java.util.ArrayList;
import java.util.List;

public class CheckSites {
    public static List<String> siteOk = new ArrayList<>();
    public static List<String> siteBad = new ArrayList<>();

   public static int check(String url) throws NoUrlExeption, NoProtocolExeption, SiteNoFoundExeption {
        if (url.equals("")) {
            throw new NoUrlExeption();
        } else if (!url.startsWith("http://")) {
            throw new NoProtocolExeption();
        }
        for (String s : siteOk) {
            if (url.equals(s)) {
                return 200;
            } else {
                throw new SiteNoFoundExeption();
            }
        }
        for (String s : siteBad) {
            if (url.equals(s)) {
                return 400;
            } else {
                throw new SiteNoFoundExeption();
            }
        }
return 200;
    }
}
