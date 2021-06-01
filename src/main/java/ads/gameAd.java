package ads;

import java.io.Serializable;

public class gameAd implements Serializable {
    private String gameName;
    private double gamePrice;
    private String gamePlatform;

    public gameAd(){}

    public gameAd(String gameName, double gamePrice, String gamePlatform){
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.gamePlatform = gamePlatform;
    }

    public String getGameName(){
        return gameName;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public double getGamePrice(){
        return this.gamePrice;
    }

    public void setGamePrice(double gamePrice){
        this.gamePrice = gamePrice;
    }

    public String getGamePlatform(){
        return this.gamePlatform;
    }

    public void setGamePlatform(String gamePlatform){
        this.gamePlatform = gamePlatform;
    }
}
