package example.codeclan.com.athletes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete extends IOException{

    private ArrayList<Integer> runLog;
    private String name;
    private AthleteLog log;

    public Athlete(String name, AthleteLog log){
        this.runLog = new ArrayList<Integer>();
        this.name = name;
        this.log = log;
    }

    public abstract int getPoints();

    public String prepare(){
        return (this.name + " is preparing to compete!");
    }

    public String compete(){
        return (this.name + " is competing! and it is good!");
    }

    public int getRunLogSize(){
        return this.runLog.size();
    }

    public void addtoRunLog(int distance) throws IOException{
        this.runLog.add(distance);
        this.log.logger(distance, this.name, getTotalDistance());
    }

    public int getLatestDistance(){
        int index = this.runLog.size() -1;
        return this.runLog.get(index);
    }

    public int getTotalDistance(){
        int total = 0;
        for(int distance: this.runLog){
            total += distance;
        }
        return total;
    }


    public String getName() {
        return this.name;
    }
}
