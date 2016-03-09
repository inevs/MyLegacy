package de.itagile.legacy;

public class Lupe  {

    private static Lupe instance = null;

    private Lupe() {
    }

    public static Lupe getInstance() {
        if (instance == null)
            instance = new Lupe();
        return instance;
    }
    public void setScale(int scale){
    	CryptTool.cryptScale(scale);
    }

    public int scale() {
            return CryptTool.decryptScale();
    }

}
