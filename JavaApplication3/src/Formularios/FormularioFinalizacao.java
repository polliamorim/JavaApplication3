
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioFinalizacao {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioFinalizacao(double TotalCompra) {
        
        //JFrame
        JFrame f6 = new JFrame("O show começa aqui!");
        f6.setSize(500, 450);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f6.setLocationRelativeTo(null);
        f6.setLayout(null);
        f6.getContentPane().setBackground(Color.black);

        //JLabel
        JLabel lblTotal = new JLabel("O total da sua compra é: R$"+ TotalCompra);
        lblTotal.setBounds(20, 90, 320, 20);
        lblTotal.setForeground(Color.white);
        
        JLabel lblPagamento = new JLabel("Forma de pagamento:");
        lblPagamento.setBounds(20, 130, 320, 20);
        lblPagamento.setForeground(Color.white);
        
        JLabel lblCartao = new JLabel("Número do cartão:");
        lblCartao.setBounds(20, 170, 320, 20);
        lblCartao.setForeground(Color.white);
        
        JLabel lblSeguranca = new JLabel("Código de segurança:");
        lblSeguranca.setBounds(20, 210, 320, 20);
        lblSeguranca.setForeground(Color.white);

        //JComboBox
        JComboBox Comb4 = new JComboBox();
        Comb4.setBounds(150, 130, 120, 20);
        Comb4.addItem("Boleto");
        Comb4.addItem("Cartão débito");
        Comb4.addItem("Cartão crédito");
        
        
        //JTEXTFIELD
        JTextField txtCartao = new JTextField();
        txtCartao.setBounds(130, 170, 140, 20);
        
        JTextField txtSeguranca = new JTextField();
        txtSeguranca.setBounds(150, 210, 120, 20);
 
        //JButton
        JButton bot2 = new JButton("Concluir");
        bot2.setBounds(110, 280, 250, 30);
        

        // Ação no botão de cadastro
        bot2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
                        
                        
                        //Fechar sistema
                        f6.dispose();
                                }

                        });

        //ADD COMPONENTES AO JFRAM
        f6.add(lblTotal);
        f6.add(lblPagamento);
        f6.add(lblCartao);
        f6.add(txtCartao);
        f6.add(lblSeguranca);
        f6.add(txtSeguranca);
        f6.add(Comb4);
        f6.add(bot2);


        //Exibir o formulário e seus componentes
        f6.setVisible(true);
    }
    
}
