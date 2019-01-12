package creational.singleton;

public class DbSingleton {

    //thread safe with volatile
    public static volatile DbSingleton dbSingleton = new DbSingleton();

    //
    private DbSingleton() {
        if (dbSingleton != null){
            throw new RuntimeException("There's geInstance() method to use!");
        }
    }

    //lazy loading
    //even more thread safe
    public static DbSingleton getDbSingleton() {
        if (dbSingleton == null) {
            synchronized (DbSingleton.class) {
                if(dbSingleton == null) {
                    dbSingleton = new DbSingleton();
                }
            }
        }
        return dbSingleton;

    }
}
