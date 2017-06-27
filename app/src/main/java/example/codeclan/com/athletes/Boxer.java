package example.codeclan.com.athletes;

/**
 * Created by user on 27/06/2017.
 */

public class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsTaken;
    private String name;

    public Boxer(int hitsGiven, int hitsTaken, String name, AthleteLog log){
        super(name, log);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public int getHitsGiven() {
        return this.hitsGiven;
    }

    public int getHitsTaken() {
        return this.hitsTaken;
    }

    public int getPoints(){
        int points = this.hitsGiven - this.hitsTaken;
        return points;
    }

}

