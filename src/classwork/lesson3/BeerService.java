package classwork.lesson3;

public class BeerService {

    /**
     * @param beerType
     * @return new object
     */
    public static Beer getBeer(BeerType beerType){
        switch (beerType){
            case OBOLON:
                return new Obolon();
            case Stella:
                return new Stella();
            case CHERNIGIVSKE:
                return new Chernigivske();
                default:
                    return null;
        }
    }
}
