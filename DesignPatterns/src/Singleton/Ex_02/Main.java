package Singleton.Ex_02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Logger applicationLog = Logger.getInstance("files/application_log.txt");

        applicationLog.log("Log 1: Variável x: 20");
        applicationLog.log("Log 2: Objeto porsche da Classe Car instanciado");

        Logger programLog = Logger.getInstance("files/program_log.txt");

        programLog.log("Log 3: Variável y: 40");
        programLog.log("Log 4: Objeto mercedes da Classe Car instanciado");
        programLog.log("Log 5: porsche vs mercedes (corrida)");

    }
}
