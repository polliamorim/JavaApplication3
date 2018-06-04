
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioEscolhaSetor {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioEscolhaSetor(int CodigoEvento) {
        
        //JFrame
        JFrame f5 = new JFrame("O show começa aqui!");
        f5.setSize(500, 450);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f5.setLocationRelativeTo(null);
        f5.setLayout(null);
        f5.getContentPane().setBackground(Color.black);

        //JLabel
        JLabel lblAssento = new JLabel("Escolha o setor");
        lblAssento.setBounds(20, 90, 320, 20);
        lblAssento.setForeground(Color.white);
        
        JLabel lblInteira = new JLabel("Entradas inteiras");
        lblInteira.setBounds(20, 130, 320, 20);
        lblInteira.setForeground(Color.white);
                
        JLabel lblMeia = new JLabel("Meia entrada");
        lblMeia.setBounds(20, 170, 320, 20);
        lblMeia.setForeground(Color.white);

        //JComboBox
        JComboBox Comb = new JComboBox(a.ListarSetores(CodigoEvento));
        Comb.setBounds(130, 90, 300, 20);
        
        JComboBox Comb1 = new JComboBox();
        Comb1.setBounds(130, 130, 40, 20);
        Comb1.addItem("0");
        Comb1.addItem("1");
        Comb1.addItem("2");
        Comb1.addItem("3");
        Comb1.addItem("4");
        Comb1.addItem("5");
        Comb1.addItem("6");
        Comb1.addItem("7");
        Comb1.addItem("8");
        Comb1.addItem("9");
       
        JComboBox Comb2 = new JComboBox();
        Comb2.setBounds(130, 170, 40, 20);
        Comb2.addItem("0");
        Comb2.addItem("1");
        Comb2.addItem("2");
        Comb2.addItem("3");
        Comb2.addItem("4");
        Comb2.addItem("5");
        Comb2.addItem("6");
        Comb2.addItem("7");
        Comb2.addItem("8");
        Comb2.addItem("9");

        //JButton
        JButton bot1 = new JButton("Finalizar compra");
        bot1.setBounds(110, 280, 250, 30);

        // Ação no botão de cadastro
        bot1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        // Chamar formulário de escolha de setor
                        FormularioFinalizacao k = new FormularioFinalizacao(a.TotalCompra(Comb.getSelectedItem().toString(), Integer.parseInt(Comb1.getSelectedItem().toString()), Integer.parseInt(Comb2.getSelectedItem().toString()), CodigoEvento));



                        //Fechar formulário
                        f5.dispose();

                }

        });
        
        

        //ADD COMPONENTES AO JFRAM
        f5.add(lblAssento);
        f5.add(lblInteira);
        f5.add(lblMeia);
        f5.add(Comb);
        f5.add(Comb1);
        f5.add(Comb2);
        f5.add(bot1);


        //Exibir o formulário e seus componentes
        f5.setVisible(true);

    }

}
        

