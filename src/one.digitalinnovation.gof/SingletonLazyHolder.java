package one.digitalinnovation.gof;

public class SingletonLazyHolder {

    private static class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
   

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstacia(){
        return instanceHolder.instancia;
    }
}
