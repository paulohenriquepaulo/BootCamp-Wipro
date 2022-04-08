package exercicioPOO.exercicio01;

public class Televisao  {

	Integer volume, canal;
	boolean ligado;    

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }   

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}