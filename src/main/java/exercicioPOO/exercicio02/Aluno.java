package exercicioPOO.exercicio02;

public class Aluno {
	
	private String matricula, nome;
	private double nota1, nota2, notaTrabalho;
	   
    public Aluno(String matricula, String nome, double nota1, double nota2,  double notaTrabalho) {
    	this.matricula = matricula;
    	this.nome = nome;
    	this.nota1 = nota1;
    	this.nota2 = nota2;
    	this.notaTrabalho = notaTrabalho;
    }
    
    public String getNome() {
		return nome;
	}
    public String getMatricula() {
		return matricula;
	}

    public double Media() {
    	return ((nota1+nota2)*1.5+notaTrabalho*2)/5;    	
    }
    
    public boolean Recuperacao() {
    	if(Media() >= 7) {
    		return false; 
    	}
    	else {
    		return true;
    	}
    }	
}
