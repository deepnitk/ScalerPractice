package oops.implOne;

public class Database {
    private static Database instance = null;
    private Database () {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
