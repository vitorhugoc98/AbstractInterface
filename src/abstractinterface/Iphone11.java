package abstractinterface;

public class Iphone11 implements Celular{

    @Override
    public void exibirCelular() {
        System.out.println("Modelo: Iphone 11");
        System.out.println("Fabrica: Apple");
        System.out.println("Categoria: Celular");
    }
    
}
