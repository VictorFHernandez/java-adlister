import java.io.Serializable;

public class albumBean implements Serializable {
    private int id;
    private String artist;
    private String name_of_record;
    private int release_date;
    private String genre;
    private float sales;


    public albumBean(){}

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String name){
        this.artist = name;
    }

    public String getName_of_record(){
        return this.name_of_record;
    }

    public void setName_of_record(String record_name){
        this.name_of_record = record_name;
    }

    public int getRelease_date(){
        return this.release_date;
    }

    public void setRelease_date(int date){
        this.release_date = date;
    }

    public String getGenre(){
        return this.genre;
    }

    public void set(String genre){
        this.genre = genre;
    }

    public float getSales(){
        return this.sales;
    }

    public void setSales(float sales){
        this.sales = sales;
    }



}
