package example.codeclan.com.athletes;

/**
 * Created by user on 27/06/2017.
 */

public class TerminalLogger implements AthleteLog {

    public void logger(int distance, String name, int total){
        System.out.println(name + ": Distance ran this session: " + distance + " miles.");
        System.out.println(name + ": Total distance ran: " + total + " miles.");
        System.out.println("-------------------");
    }
}
