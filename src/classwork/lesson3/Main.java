package classwork.lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        final Beer beer = BeerService.getBeer(BeerType.OBOLON);

        beer.drink();

        System.out.println(Arrays.asList(BeerType.values()));
    }
}
