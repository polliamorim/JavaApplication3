
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

public class FormularioCadastroSetores {
    
    //Instanciar ação
    Acao a = new Acao();
    
    public int RecebeIndice;
    
    //Construtor
    public FormularioCadastroSetores(int RecebeIndice) {
        
        this.RecebeIndice = RecebeIndice;
       
        //JFrame
        JFrame f3 = new JFrame("Cadastro de setores");
        f3.setSize(500, 450);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setLocationRelativeTo(null);
        f3.setLayout(null);
        f3.getContentPane().setBackground(Color.black);
		
        //JLabel
        JLabel lblSetor = new JLabel("Setor");
        lblSetor.setBounds(20, 20, 290, 20);
        lblSetor.setForeground(Color.white);
                
        JLabel lblValor = new JLabel("Valor entrada");
        lblValor.setBounds(20, 60, 290, 20);
        lblValor.setForeground(Color.white);
		
        JLabel lblValorMeia = new JLabel("Valor meia entrada");
        lblValorMeia.setBounds(20, 100, 290, 20);
        lblValorMeia.setForeground(Color.white);
				
        //JTEXTFIELD
        JTextField txtSetor = new JTextField();
        txtSetor.setBounds(60,20, 270, 20);
		
        JFormattedTextField txtValor = new JFormattedTextField();
        txtValor.setBounds(110, 60, 220, 20);
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
                
        JFormattedTextField txtValorMeia = new JFormattedTextField();
        txtValorMeia.setBounds(140,100, 190, 20);
        txtValorMeia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        	
        //JButton
        JButton bo = new JButton("Cadastrar setor");
        bo.setBounds(110, 180, 250, 30);
		
            // Ação no botão de cadastro
            bo.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
                    
                    a.CadastrarSetores(txtSetor.getText(), Double.parseDouble(txtValor.getText().replace(",", ".")), Double.parseDouble(txtValorMeia.getText().replace(",", ".")), RecebeIndice);
                    
                    // Limpar campos
                    txtSetor.setText("");
                    txtValor.setText("");
                    txtValorMeia.setText("");
			
                    // Cursor no campo nome
                    txtSetor.requestFocus();

                    
            }

	});
            
        JButton bo2 = new JButton("Sair");
        bo2.setBounds(110, 260, 250, 30);
		
            // Ação no botão de cadastro
            bo2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

					

		f3.dispose();
            }

	});
		
        //ADD COMPONENTES AO JFRAM
        f3.add(lblSetor);
        f3.add(txtSetor);
        f3.add(lblValor);
        f3.add(txtValor);
        f3.add(lblValorMeia);
        f3.add(txtValorMeia);
        f3.add(bo);
        f3.add(bo2);
				
						
        //Exibir o formulário e seus componentes
        f3.setVisible(true);
		
	}

}

    




  
