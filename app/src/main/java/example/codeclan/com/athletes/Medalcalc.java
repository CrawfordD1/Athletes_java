package example.codeclan.com.athletes;

/**
 * Created by user on 27/06/2017.
 */

public class Medalcalc {



    public String giveMedal(Athlete athlete){
        if(athlete.getPoints() <= 9 && athlete.getPoints() >= 5){
            return "Bronze!";
        }
        if(athlete.getPoints() <= 14 && athlete.getPoints() >= 10){
            return "Silver!";
        }
        if(athlete.getPoints() >= 15){
            return "Gold!";
        }
        else{
            return "Nothing! UNLUCKY!";
        }
    }
}
