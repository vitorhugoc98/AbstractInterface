package abstractinterface;

public class Apple implements Eletronicos{

    @Override
    public Notebook criarNotebook() {
        return new MacBook(); 
    }

    @Override
    public Celular criarCelular() {
        return new Iphone11(); 
    }
    
}
