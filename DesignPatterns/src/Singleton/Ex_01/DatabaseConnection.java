package Singleton.Ex_01;

import javax.xml.crypto.Data;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private String connectionString;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DatabaseConnection getInstance(String connectionString){
        if(instance==null){
            instance= new DatabaseConnection(connectionString);
        }
        return instance;
    }

    public void connect(){
        // Conexão à Base de Dados
        System.out.println("Conectado à Base de Dados: "+this.connectionString);
    }

    public void disconnect(){
        // Fecha a conexão à Base de Dados
        System.out.println("Desconectado à Base de Dados: "+this.connectionString);
    }
}
