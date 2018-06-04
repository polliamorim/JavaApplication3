
package Aplicacoes;

import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class Acao {
    
    //Criar objeto
    private Usuarios u = new Usuarios();
    private Eventos t = new Eventos();
    private Setores v = new Setores();
    
    //Método para cadastro de usuario
    public void CadastrarUsuario(String usuario, String senha, String definicao) {
		
	this.u.usuario = usuario;
        this.u.senha = senha;
        this.u.definicao = definicao;


	//Adicionar ao ArrayList
	Usuarios.dados.add(this.u);	
		
    }
    
    //Método verificar usuário
    public boolean VerificarUsuario(String usuario, String senha) {
        boolean verifica = false;
        for(int i = 0; i < u.dados.size(); i++){
            if((u.dados.get(i).usuario.equals(usuario)) && (u.dados.get(i).senha.equals(senha))){
                verifica = true;
                break;
            }else{
                verifica = false;
            }
        }
        return verifica;
    }
    
    //Método para verificar se é administrador ou cliente
    public boolean VerificarNivelAcesso(String usuario) {
        boolean verifica = false;
        for(int i = 0; i < u.dados.size(); i++){
            if((u.dados.get(i).usuario.equals(usuario)) && (u.dados.get(i).definicao.equals("S"))){
                verifica = true;
                break;
            }else{
                verifica = false;
            }
        }
        return verifica;    
    }
    
    //Método verificar se o usuário a cadastrar já existe
    public boolean VerificarUsuarioParaCadastro(String usuario) {
        boolean conferir = true;
        for(int i = 0; i < u.dados.size(); i++){
            if((u.dados.get(i).usuario.equals(usuario))){
                conferir = true;
                break;
            }else{
                conferir = false;
            }
        }
        return conferir;
    }
    
    //Método para cadastro dos eventos
    public int CadastrarEventos(String Evento, String Dia, String Local, String Horario){
        
        int PosicaoEvento;
        
        this.t.Evento = Evento;
        this.t.Dia = Dia;
        this.t.Local = Local;
        this.t.Horario = Horario;
        
        //Adicionar ao ArrayList
        Eventos.informacoes.add(this.t);
        
        PosicaoEvento = Eventos.informacoes.indexOf(t);
        
        return PosicaoEvento;
    }
    
    //Método para cadastro dos setores
    public void CadastrarSetores(String Setor, double Valor, double ValorMeia, int CodigoEvento){
        this.v = new Setores();
        this.v.Setor = Setor;
        this.v.Valor = Valor;
        this.v.ValorMeia = ValorMeia;
        this.v.CodigoEvento = CodigoEvento;
        
        //Adicionar ao ArrayList
        Setores.elementos.add(this.v);
        
    }
        
    //Método para apresentar informações no ComboBox referente aos eventos
    public DefaultComboBoxModel<Eventos> ListarEventos() {

        // Vetor
        Vector<Eventos> ListadeEventos = new Vector<>();

        // Atribuir um título
        Eventos s = new Eventos();

        if (Eventos.informacoes.size() > 0) {
                s.setEvento("Selecione um evento");
        } else {
                s.setEvento("Não há eventos cadastrados");
        }

        ListadeEventos.add(s);

        // Laço
        for (int i = 0; i < Eventos.informacoes.size(); i++) {
                ListadeEventos.add(Eventos.informacoes.get(i));
        }

        // DefaultComboModel
        DefaultComboBoxModel<Eventos> modelo = new DefaultComboBoxModel<>(ListadeEventos);

        // Retorno
        return modelo;
	
    }
    
    //Método para apresentar dia do evento
    public String DiaEvento(String Evento) {
        String Dia = " ";
        
        for(int i = 0; i < t.informacoes.size(); i++){
            if((t.informacoes.get(i).Evento.equals(Evento))){
                Dia = t.informacoes.get(i).Dia;
                break;
            }else{
                Dia = " ";
            }
        }
        return Dia;
    
    }
    
    //Método para apresentar local do evento
    public String LocalEvento(String Evento) {
        String Local = " ";
        
        for(int i = 0; i < t.informacoes.size(); i++){
            if((t.informacoes.get(i).Evento.equals(Evento))){
                Local = t.informacoes.get(i).Local;
                break;
            }else{
                Local = " ";
            }
        }
        return Local;
    
    }
    
    //Método para apresentar horario do evento
    public String HorarioEvento(String Evento) {
        String Horario = " ";
        
        for(int i = 0; i < t.informacoes.size(); i++){
            if((t.informacoes.get(i).Evento.equals(Evento))){
                Horario = t.informacoes.get(i).Horario;
                break;
            }else{
                Horario = " ";
            }
        }
        return Horario;
    
    }
    
    //Método para apresentar informações no ComboBox referente aos setores
    public DefaultComboBoxModel<Setores> ListarSetores(int CodigoEvento) {

        // Vetor
        Vector<Setores> ListadeSetores = new Vector<>();

        // Atribuir um título
        Setores z = new Setores();

        if (Setores.elementos.size() > 0) {
            z.setSetor("Selecione um setor");
        } else {
            z.setSetor("Não há setores cadastrados");
        }

        ListadeSetores.add(z);

        // Laço
        for (int i = 0; i < Setores.elementos.size(); i++) {
            if (Setores.elementos.get(i).CodigoEvento == CodigoEvento) {
                ListadeSetores.add(Setores.elementos.get(i));
            }
        }

        // DefaultComboModel
        DefaultComboBoxModel<Setores> modelo1 = new DefaultComboBoxModel<>(ListadeSetores);

        // Retorno
        return modelo1;
	
    }
    
    //Método para buscar o código do evento
    public int getCodigoEvento(String Evento) {
        int CodigoEvento = -1;
        
        for(int i = 0; i < t.informacoes.size(); i++){
            if((t.informacoes.get(i).Evento.equals(Evento))){
                CodigoEvento = i;
                break;
            }else{
                CodigoEvento = -1;
            }
        }
        
        return CodigoEvento;
    }
    
    //Método para calcular o total da compra
    public double TotalCompra(String Setor, int Inteira, int Meia, int CodigoEvento) {
        
        double Total = 0.00;
        
        for(int i = 0; i < v.elementos.size(); i++){
            if((v.elementos.get(i).toString().equals(Setor) && v.elementos.get(i).CodigoEvento == CodigoEvento)){
                Total = (v.elementos.get(i).Valor*Inteira) + (v.elementos.get(i).ValorMeia*Meia);
                
                break;
            }else{
                Total = 0.00;
            }
        }
        
        return Total;    
    }
}