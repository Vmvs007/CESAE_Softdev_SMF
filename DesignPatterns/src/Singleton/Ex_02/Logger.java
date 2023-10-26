package Singleton.Ex_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private String path;
    private static Logger instance;

    private Logger(String path) {
        this.path = path;
    }

    public static Logger getInstance(String path){
        if(instance == null){
            instance = new Logger(path);
        }

        return instance;
    }

    public void log(String log_message) throws IOException {

        // FileWriter com função append para escrever no ficheiro, à frente do que já lá existe
        FileWriter fw = new FileWriter(this.path,true);

        fw.append(log_message+"\n");

        fw.close();

    }
}
