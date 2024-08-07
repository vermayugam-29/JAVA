public class Singleton {
    private Singleton () {}

    private static Singleton instance;

    public static Singleton getInstance() {
        //now only one object can be created of this class
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
