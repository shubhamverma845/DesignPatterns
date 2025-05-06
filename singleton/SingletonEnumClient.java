package singleton;

public class SingletonEnumClient {

    public static void main(String[] args) {
        SingletonWithEnum singleton = SingletonWithEnum.UNIQUE_INSTANCE;

        System.out.println(singleton.getDescription());
    }
}
