package eu.runelord.programmers.io.dp.singleton;

public class SimpleSingleton {
	 
    private static SimpleSingleton INSTANCE;
 
    private SimpleSingleton(){}
 
    public static SimpleSingleton getInstance(){
        if(INSTANCE==null)
            INSTANCE = new SimpleSingleton();
        return INSTANCE;
    }
}