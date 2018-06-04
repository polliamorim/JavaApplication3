
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormularioCadastroCliente {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioCadastroCliente() {
 
        //JFrame
        JFrame f = new JFrame("Cadastro de clientes");
        f.setSize(500, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.black);
		
        //JLabel
        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(20, 20, 290, 20);
        lblNome.setForeground(Color.white);
                
        JLabel lblData = new JLabel("Data de nascimento");
        lblData.setBounds(20, 60, 290, 20);
        lblData.setForeground(Color.white);
		
        JLabel lblLog = new JLabel("Login");
        lblLog.setBounds(20, 100, 290, 20);
        lblLog.setForeground(Color.white);
		
        JLabel lblEmail = new JLabel("E-mail");
        lblEmail.setBounds(20, 140, 290, 20);
        lblEmail.setForeground(Color.white);
                
        JLabel lblAcesso = new JLabel("Cadastre uma senha de 6 dígitos");
        lblAcesso.setBounds(20, 180, 290, 20);
        lblAcesso.setForeground(Color.white);
				
        //JTEXTFIELD
        JTextField txtNome = new JTextField();
        txtNome.setBounds(60,20, 350, 20);
		
        JTextField txtData = new JTextField();
        txtData.setBounds(140, 60, 270, 20);
                
        JTextField txtLog = new JTextField();
        txtLog.setBounds(55,100, 355, 20);
		
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(60, 140, 350, 20);
                
        JPasswordField txtAcesso = new JPasswordField();
        txtAcesso.setBounds(210, 180, 200, 20);
        	
        //JButton
        JButton boton = new JButton("Cadastrar cliente");
        boton.setBounds(110, 260, 250, 30);
		
            // Ação no botão de cadastro
            boton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
                    
                if(!a.VerificarUsuarioParaCadastro(txtLog.getText())) {
                    a.CadastrarUsuario(txtLog.getText(), txtAcesso.getText(), "N");
                }else{   
                    JOptionPane.showMessageDialog(null, "Esse Login já existe! Favor cadastrar outro.");
                }

				
		f.dispose();
                
             
					}

				});
		
        //ADD COMPONENTES AO JFRAM
        f.add(lblNome);
        f.add(txtNome);
        f.add(lblData);
        f.add(txtData);
        f.add(lblLog);
        f.add(txtLog);
        f.add(lblEmail);
        f.add(txtEmail);
        f.add(lblAcesso);
        f.add(txtAcesso);
        f.add(boton);
				
						
        //Exibir o formulário e seus componentes
        f.setVisible(true);
		
	}

}

    



