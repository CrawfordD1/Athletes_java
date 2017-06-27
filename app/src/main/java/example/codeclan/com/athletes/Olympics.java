package example.codeclan.com.athletes;

import java.io.IOException;

/**
 * Created by user on 27/06/2017.
 */

public class Olympics extends IOException {

    private Boxer boxer;
    private Gymnast gymnast;
    private Medalcalc medalCalc;

    public static void main(String[] args) throws IOException {
        TerminalLogger log = new TerminalLogger();
        TextFileLogger textlog = new TextFileLogger();
        Medalcalc medalCalc = new Medalcalc();
        Boxer boxer = new Boxer(25, 9, "Kieran", log);
        Gymnast gymnast = new Gymnast(1, 1, "Graham", textlog);
        boxing(boxer, medalCalc);
        boxer.addtoRunLog(5);
        gymnastics(gymnast, medalCalc);
        gymnast.addtoRunLog(7);
    }

    public static void boxing(Boxer boxer, Medalcalc medalCalc){
        System.out.println(boxer.prepare());
        System.out.println(boxer.compete());
        System.out.println(boxer.getName() + " has won " + medalCalc.giveMedal(boxer));

    }

    public static void gymnastics(Gymnast gymnast, Medalcalc medalCalc){
        System.out.println(gymnast.prepare());
        System.out.println(gymnast.compete());
        System.out.println(gymnast.getName() + " has won " + medalCalc.giveMedal(gymnast));

    }


}
