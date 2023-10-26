package Singleton.Ex_03;

import java.util.Random;

public class UserSessionManager {

    private String token;
    private long lastAccess;
    private static UserSessionManager instance;

    private UserSessionManager() {
        this.token= String.valueOf(new Random().nextInt());
        this.lastAccess= System.currentTimeMillis();
    }

    public static UserSessionManager getInstance(){
        if(instance==null){
            instance= new UserSessionManager();
        }

        return instance;
    }

    public String getToken() {
        return token;
    }

    public long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = System.currentTimeMillis();
    }
}
