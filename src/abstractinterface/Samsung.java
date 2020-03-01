package abstractinterface;

public class Samsung implements Eletronicos{

    @Override
    public Notebook criarNotebook() {
        return new Odyssey();
    }

    @Override
    public Celular criarCelular() {
        return new GalaxyS20(); 
    }
    
}
