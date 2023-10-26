package Singleton.Ex_01;

public class Main {
    public static void main(String[] args) {

        DatabaseConnection ligacaoBD = DatabaseConnection.getInstance("mysql://localhost:3306/myDatabase");

        ligacaoBD.connect();
        ligacaoBD.disconnect();

        DatabaseConnection ligacaoBD2 = DatabaseConnection.getInstance("mysql://localhost:8000/myDatabase");

        ligacaoBD2.connect();

    }
}
