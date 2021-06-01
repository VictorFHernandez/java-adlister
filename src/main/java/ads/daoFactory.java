package ads;

public class daoFactory {
    private static gameAds gameAdsDao;

    public static gameAds getGameAdsDao(){
        if(gameAdsDao == null){
            gameAdsDao = new gameAdsList();
        }
        return gameAdsDao;
    }
}
