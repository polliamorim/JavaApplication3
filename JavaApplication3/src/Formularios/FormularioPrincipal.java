
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioPrincipal {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioPrincipal() {
        
        a.CadastrarUsuario("polliane", "123456", "S");

        //JFrame
        JFrame frm = new JFrame("Bem vindo ao Ticket's! O show começa aqui!");
        frm.setSize(500, 450);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setLayout(null);
        frm.getContentPane().setBackground(Color.black);

        //JLabel
        JLabel lblLogin = new JLabel("Login");
        lblLogin.setBounds(120, 90, 320, 20);
        lblLogin.setForeground(Color.white);

        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(120, 130, 320, 20);
        lblSenha.setForeground(Color.white);

        //JTEXTFIELD
        JTextField txtLogin = new JTextField();
        txtLogin.setBounds(160, 90, 190, 20);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(160, 130, 190, 20);
       

        //JButton
        
        JButton botons = new JButton("Acessar");
        botons.setBounds(110,180,250,30);
        
        // Ação no botão de acesso
        botons.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!a.VerificarUsuario(txtLogin.getText(),txtSenha.getText())){
                        JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                    }else{
                        if(a.VerificarNivelAcesso(txtLogin.getText())){
                            FormularioOpcaoAdm b = new FormularioOpcaoAdm();
                        }else{
                            FormularioCompra c = new FormularioCompra();
                        }
                    }
                    // Limpar campos
                    txtLogin.setText("");
                    txtSenha.setText("");
			
                    // Cursor no campo nome
                    txtLogin.requestFocus();
                }

        }); 
        
        JButton btn = new JButton("Não tem cadastro, clique aqui");
        btn.setBounds(110, 260, 250, 30);

        // Ação no botão de cadastro
        btn.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        // Chamar formulário de cadastro
                        FormularioCadastroCliente b = new FormularioCadastroCliente();

                }

        });

        //ADD COMPONENTES AO JFRAM
        frm.add(lblLogin);
        frm.add(txtLogin);
        frm.add(lblSenha);
        frm.add(txtSenha);
        frm.add(botons);
        frm.add(btn);


        //Exibir o formulário e seus componentes
        frm.setVisible(true);

    }

}

    

