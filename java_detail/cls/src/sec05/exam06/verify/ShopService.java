package sec05.exam06.verify;

public class ShopService {
    //oxoo
    //2
    private static ShopService shopService = new ShopService();

    private ShopService(){}
    static ShopService getInstance(){
        return shopService;
    }
}
