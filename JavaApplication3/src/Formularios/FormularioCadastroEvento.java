
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioCadastroEvento {
    
    //Instanciar ação
    Acao a = new Acao();
    
    
    //Construtor
    public FormularioCadastroEvento() {
        
        //JFrame
        JFrame f2 = new JFrame("Cadastro do Evento");
        f2.setSize(500, 450);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocationRelativeTo(null);
        f2.setLayout(null);
        f2.getContentPane().setBackground(Color.black);
		
        //JLabel
        JLabel lblEvento = new JLabel("Evento");
        lblEvento.setBounds(20, 20, 290, 20);
        lblEvento.setForeground(Color.white);
                
        JLabel lblDia = new JLabel("Data");
        lblDia.setBounds(20, 60, 290, 20);
        lblDia.setForeground(Color.white);
		
        JLabel lblLocal = new JLabel("Local");
        lblLocal.setBounds(20, 100, 290, 20);
        lblLocal.setForeground(Color.white);
		
        JLabel lblHorario = new JLabel("Horário");
        lblHorario.setBounds(20, 140, 290, 20);
        lblHorario.setForeground(Color.white);
        
				
        //JTEXTFIELD
        JTextField txtEvento = new JTextField();
        txtEvento.setBounds(70,20, 355, 20);
		
        JFormattedTextField txtDia = new JFormattedTextField();
        txtDia.setBounds(60, 60, 365, 20);
        txtDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
                
        JTextField txtLocal = new JTextField();
        txtLocal.setBounds(60,100, 365, 20);
		
        JFormattedTextField txtHorario = new JFormattedTextField();
        txtHorario.setBounds(75, 140, 350, 20);
        txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                
        	
        //JButton
        JButton bot = new JButton("Cadastrar evento");
        bot.setBounds(110, 260, 250, 30);
		
            // Ação no botão de cadastro
            bot.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
                    
                    int RecebePosicao;
                    
                    RecebePosicao = a.CadastrarEventos(txtEvento.getText(), txtDia.getText(), txtLocal.getText(), txtHorario.getText());
                    
                    // Chamar formulário de cadastro de setores
                    FormularioCadastroSetores s = new FormularioCadastroSetores(RecebePosicao);
					

		f2.dispose();	
					}

				});
		
        //ADD COMPONENTES AO JFRAM
        f2.add(lblEvento);
        f2.add(txtEvento);
        f2.add(lblDia);
        f2.add(txtDia);
        f2.add(lblLocal);
        f2.add(txtLocal);
        f2.add(lblHorario);
        f2.add(txtHorario);
        f2.add(bot);
				
						
        //Exibir o formulário e seus componentes
        f2.setVisible(true);
        
    }
    
}
