package ads;
import java.util.ArrayList;
import java.util.List;

public class gameAdsList implements gameAds{
    private List<gameAd> gameAds = new ArrayList<>();

    public gameAdsList(){
        insert(new gameAd("Dark Souls Remastered", 29.99, "PlayStaion 4 & Xbox One"));
        insert(new gameAd("Dark Souls II", 19.99, "PlayStation 4 & Xbox One"));
        insert(new gameAd("Dark Souls III", 39.99, "PlayStation 4 & Xbox One"));
        insert(new gameAd("BloodBorne", 49.99, "PlayStation 4"));
        insert(new gameAd("Demon Souls Remake", 69.99, "PlayStation 5"));
    }

    @Override
    public List<gameAd> all() {
        return null;
    }

    @Override
    public void insert(gameAd gameAd) {
        this.gameAds.add(gameAd);
    }
}
