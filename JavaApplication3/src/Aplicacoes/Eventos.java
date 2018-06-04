
package Aplicacoes;

import java.util.ArrayList;

public class Eventos {
    
    //Atributos
    String Evento;
    String Dia;
    String Local;
    String Horario;
    
     public static ArrayList<Eventos> informacoes = new ArrayList<>();
     
     //Método set
     public void setEvento(String Evento) {
		this.Evento = Evento;
        
     }    
     
    //Método get
     public String getDia() {
         return this.Dia;
     }
     
     public String getLocal() {
         return this.Local;
     }
     
     public String getHorario() {
         return this.Horario;
     }
     
    //Exibir o nome do evento
    public String toString() {
	return Evento;
	}
    
}
