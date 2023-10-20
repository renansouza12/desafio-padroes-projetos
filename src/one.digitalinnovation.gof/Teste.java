package one.digitalinnovation.gof;

public class Teste{
    public static void main(String[] args){
        //Testes Single
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

           
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
    }
}