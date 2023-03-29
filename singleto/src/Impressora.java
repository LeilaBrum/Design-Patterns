public class Impressora {

    private static Impressora instance = new Impressora();
    private Impressora(){
    }
    public static Impressora getInstance(){
        if (instance == null)
        return instance;
    }
}