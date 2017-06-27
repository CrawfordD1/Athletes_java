package example.codeclan.com.athletes;

/**
 * Created by user on 27/06/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;
    private String name;

    public Gymnast(int difficulty, int execution, String name, AthleteLog log){
        super(name, log);
        this.difficulty = difficulty;
        this.execution = execution;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public int getExecution() {
        return this.execution;
    }

    public int getPoints(){
        int points = this.difficulty + this.execution;
        return points;
    }

}
