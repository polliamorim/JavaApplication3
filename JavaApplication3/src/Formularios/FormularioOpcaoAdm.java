
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FormularioOpcaoAdm {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioOpcaoAdm() {
        
         //JFrame
        JFrame f7 = new JFrame("O show começa aqui!");
        f7.setSize(500, 450);
        f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f7.setLocationRelativeTo(null);
        f7.setLayout(null);
        f7.getContentPane().setBackground(Color.black);
        
         //JButton
        JButton btn1 = new JButton("Cadastrar novo administrador");
        btn1.setBounds(110,130,250,30);
        
        // Ação no botão de cadastro
        btn1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        // Chamar formulário de cadastro
                        FormularioCadastroAdministrador p = new FormularioCadastroAdministrador();
                       	
                    

                                }

         });
        
        JButton btn2 = new JButton("Cadastrar novo evento");
        btn2.setBounds(110,190,250,30);
        
        // Ação no botão de cadastro
        btn2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        // Chamar formulário de cadastro
                        FormularioCadastroEvento q = new FormularioCadastroEvento();
                       	
                        

                                }

         });
        
        JButton btn3 = new JButton("Sair");
        btn3.setBounds(110,250,250,30);
        
        // Ação no botão de cadastro
        btn3.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        f7.dispose();
                       	
                        

                                }

         });
        
        //ADD COMPONENTES AO JFRAM
        f7.add(btn1);
        f7.add(btn2);
        f7.add(btn3);
        
        //Exibir o formulário e seus componentes
        f7.setVisible(true);
        
        
    }
    
}
