package abstractinterface;

public class AbstractInterface {

    public static void main(String[] args) {
        
        Eletronicos eletronico00 = new Apple(); 
        Notebook notebook00 = eletronico00.criarNotebook();
        notebook00.exibirNotebook();
        System.out.println("");
        
        Celular celular00 = eletronico00.criarCelular();
        celular00.exibirCelular();
        
        System.out.println("");
        
        Eletronicos eletronico01 = new Samsung(); 
        Notebook notebook01 = eletronico01.criarNotebook(); 
        notebook01.exibirNotebook();
        System.out.println("");
        
        Celular celular01 = eletronico01.criarCelular();
        celular01.exibirCelular();
        
    }
    
}
