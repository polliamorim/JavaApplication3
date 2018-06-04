
package Formularios;

import Aplicacoes.Acao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioCompra {
    
    //Instanciar ação
    Acao a = new Acao();
    
    //Construtor
    public FormularioCompra() {

        //JFrame
        JFrame f4 = new JFrame("O show começa aqui!");
        f4.setSize(500, 450);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setLocationRelativeTo(null);
        f4.setLayout(null);
        f4.getContentPane().setBackground(Color.black);

        //JLabel
        JLabel lblEscolha = new JLabel("Escolha seu show");
        lblEscolha.setBounds(20, 20, 320, 20);
        lblEscolha.setForeground(Color.white);
        
        JLabel lblDia = new JLabel("Data: ");
        lblDia.setBounds(20, 60, 290, 20);
        lblDia.setForeground(Color.white);
        
        JLabel lblLocal = new JLabel("Local: ");
        lblLocal.setBounds(20, 100, 290, 20);
        lblLocal.setForeground(Color.white);
		
        JLabel lblHorario = new JLabel("Horário: ");
        lblHorario.setBounds(20, 140, 290, 20);
        lblHorario.setForeground(Color.white);
        

        //JComboBox
        JComboBox Combo = new JComboBox(a.ListarEventos());
        Combo.setBounds(130, 20, 255, 20);
        
        Combo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                lblDia.setText("Data: " +a.DiaEvento(Combo.getSelectedItem().toString()));
                lblLocal.setText("Local: " +a.LocalEvento(Combo.getSelectedItem().toString()));
                lblHorario.setText("Horário: " +a.HorarioEvento(Combo.getSelectedItem().toString()));
            }
        });
         

        //JButton
        JButton bot = new JButton("Prosseguir");
        bot.setBounds(110, 280, 250, 30);

        // Ação no botão de cadastro
        bot.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                        // Chamar formulário de escolha de setor
                        FormularioEscolhaSetor g = new FormularioEscolhaSetor(a.getCodigoEvento(Combo.getSelectedItem().toString()));




                        f4.dispose();



                                }

                        });

        //ADD COMPONENTES AO JFRAM
        f4.add(lblEscolha);
        f4.add(Combo);
        f4.add(lblDia);
        f4.add(lblLocal);
        f4.add(lblHorario);
        f4.add(bot);


        //Exibir o formulário e seus componentes
        f4.setVisible(true);

        }
    
    
    }
       
    
    
