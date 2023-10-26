package Singleton.Ex_03;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        UserSessionManager sessionManager = UserSessionManager.getInstance();

        System.out.println("Token de Acesso: " + sessionManager.getToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());

        Thread.sleep(3000);
        sessionManager.setLastAccess();

        System.out.println("Token de Acesso: " + sessionManager.getToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());

    }
}
