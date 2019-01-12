package creational.singleton;

public class Main {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getDbSingleton();

        System.out.println(instance);

        //doubled the instance to check if result is going to be the same
        DbSingleton anotherInstance = DbSingleton.getDbSingleton();
        System.out.println(anotherInstance);

    }
}
