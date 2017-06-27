package example.codeclan.com.athletes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 27/06/2017.
 */

public class TextFileLogger implements AthleteLog {


    public void logger(int distance, String name, int total) {
        try {
            File file = new File("/Users/user/Desktop/codeclan_work/Week7/day_02/HW/app/src/main/java/example/codeclan/com/athletes/RunLog.txt");
            FileWriter writer = new FileWriter(file, true);
            PrintWriter output = new PrintWriter(writer);
            output.println(name + ": session: " + distance);
            output.println(name + ": total: " + total);
            output.flush();
            output.close();
        } catch (Exception e){

        }
    }
}
