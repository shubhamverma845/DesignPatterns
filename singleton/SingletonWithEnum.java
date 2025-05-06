package singleton;

public enum SingletonWithEnum {
    UNIQUE_INSTANCE;


    public String getDescription() {
        return "Thread safe singleton class with Enum";
    }
}
