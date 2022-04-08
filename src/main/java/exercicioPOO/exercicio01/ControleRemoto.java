package exercicioPOO.exercicio01;

import java.util.Scanner;

public class ControleRemoto {

	Integer volumeMaximo=10, canalMaximo=10; 
	int botaoInformado;
	
	Scanner sc = new Scanner(System.in);
	
	Televisao tv = new Televisao();
			
	boolean isLigado() {    	
    	return tv.isLigado();     
    }
	
	void ligaDesligaTV(){    	
    	if (isLigado()) {
			tv.setLigado(false);
			System.out.print("\nSua TV foi desligada!\n");
		} else {
			tv.setLigado(true);
			tv.setVolume(1);
			tv.setCanal(2);
			System.out.print("\nSua TV foi ligada!\n");
		}    	
    }    

	void aumentarVolume(){
	    Integer volume = tv.getVolume();
	    if(volume < volumeMaximo){
	       volume++;
	       tv.setVolume(volume);
	       System.out.printf("\nSua TV está no volume %d.\n",tv.getVolume());
	    }else{
	        System.out.println("\nO volume da TV já está no máximo!");
	    }
	}
    
    void diminuirVolume(){
    	Integer volume = tv.getVolume();
	    if(volume > 0){
	       volume--;
	       tv.setVolume(volume);
	       System.out.printf("\nSua TV está no volume %d.\n",tv.getVolume());
	    }else{
	        System.out.println("\nO volume da TV já está no mínimo!");
	    }        
    }
    
    void aumentarCanal(){
    	Integer canal = tv.getCanal();
	    if(canal < canalMaximo){
	    	canal++;
	    	tv.setCanal(canal);
	    }
	    else {
	    	tv.setCanal(1);
	    }
	    System.out.printf("\nSua TV está no canal %d.\n",tv.getCanal());
    }
    
    void diminuirCanal(){
    	Integer canal = tv.getCanal();
	    if(canal > 1){
	    	canal--;
	    	tv.setCanal(canal);
	    }
	    else {
	    	tv.setCanal(canalMaximo);
	    }
	    System.out.printf("\nSua TV está no canal %d.\n",tv.getCanal());
        
    }
    
    void infoTV(){
    	System.out.printf("\nSua TV está no canal %d e com o volume %d.\n",tv.getCanal(),tv.getVolume());    	
    }
    
    void trocarCanal() {
    	try {
    		System.out.print("Informe o canal desejado: ");
			botaoInformado = Integer.parseInt(sc.next());
			
			if(botaoInformado > 0 && botaoInformado <= canalMaximo) {
				tv.setCanal(botaoInformado);
				infoTV();
			}
			else {
				System.out.println("Este canal não estar sintonizado com sua TV!");
			}
		} catch (NumberFormatException e) {
			System.out.println("Opção inválida!");
		}
    }
    
}