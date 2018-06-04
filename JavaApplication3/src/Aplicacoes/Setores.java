
package Aplicacoes;

import java.util.ArrayList;

public class Setores {
    
    //Atributos
    String Setor;
    double Valor = 0.00;
    double ValorMeia = 0.00;
    int CodigoEvento;
    
    
    //ArrayList
     public static ArrayList<Setores> elementos = new ArrayList<>();
     
    //Método set
     public void setSetor(String Setor) {
		this.Setor = Setor;
     
     }
    
    //Exibir o nome do evento
    public String toString() {
	return Setor+ " - Valor: R$ "+Valor+" Meia: R$ "+ValorMeia;
	}
}
