package abstractinterface;

public class MacBook implements Notebook{

    @Override
    public void exibirNotebook() {
        System.out.println("Modelo: MacBook");
        System.out.println("Fabrica: Apple");
        System.out.println("Categoria: Notebook");
    }
    
}
