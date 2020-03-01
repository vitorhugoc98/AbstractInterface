package abstractinterface;

public class GalaxyS20 implements Celular{

    @Override
    public void exibirCelular() {
        System.out.println("Modelo: Galaxy S20");
        System.out.println("Fabrica: Samsung");
        System.out.println("Categoria: Celular");
    }
    
}
