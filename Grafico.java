package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Grafico extends JFrame implements ActionListener, ItemListener {
    JRadioButton rbotons, rbotonr, rbotonm, rbotond;
    ButtonGroup grupoBotones = new ButtonGroup();
    JComboBox combito;
    private JButton botoncito1;
    private JButton botoncito2;
    private JButton botoncito3;
    private JButton botoncito4;
    private JTextField cuadrito1, cuadrito2;
    
    public Grafico(){
        //frame
        setLayout(null);
        setBounds(200, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora HD");
        
        //del botoncito
        botoncito1 = new JButton("Suma");
        botoncito1.setBounds(50, 300, 70, 30);
        botoncito1.addActionListener(this);
        add(botoncito1);
        
        //del botoncito
        botoncito2 = new JButton("Resta");
        botoncito2.setBounds(130, 300, 70, 30);
        botoncito2.addActionListener(this);
        add(botoncito2);
        
        //del botoncito
        botoncito3 = new JButton("Multi");
        botoncito3.setBounds(210, 300, 70, 30);
        botoncito3.addActionListener(this);
        add(botoncito3);
        
        //del botoncito
        botoncito4 = new JButton("Div");
        botoncito4.setBounds(290, 300, 70, 30);
        botoncito4.addActionListener(this);
        add(botoncito4);
        
        //del texto
        JLabel label1 = new JLabel();
        label1.setBounds(50, 50, 60, 30);
        label1.setText("Número 1:");
        add(label1);
        
        JLabel label2 = new JLabel();
        label2.setBounds(200, 50, 60, 30);
        label2.setText("Número 2:");
        add(label2);
        
        JLabel label3 = new JLabel();
        label3.setBounds(215, 10, 170, 30);
        label3.setText("Bienvenido a mi calculadora");
        add(label3);
        
        //entrada de datos
        cuadrito1 = new JTextField();
        cuadrito1.setBounds(120, 50, 50, 30);
        add(cuadrito1);
        
        cuadrito2 = new JTextField();
        cuadrito2.setBounds(270, 50, 50, 30);
        add(cuadrito2);
        
        //RadioBotones
        rbotons = new JRadioButton("Suma", false);
        rbotons.setBounds(50, 200, 70, 30);
        add(rbotons);
        grupoBotones.add(rbotons);
        
        rbotonr = new JRadioButton("Resta", false);
        rbotonr.setBounds(130, 200, 70, 30);
        add(rbotonr);
        grupoBotones.add(rbotonr);
        
        rbotonm = new JRadioButton("Multi", false);
        rbotonm.setBounds(210, 200, 70, 30);
        add(rbotonm);
        grupoBotones.add(rbotonm);
        
        rbotond = new JRadioButton("Div", false);
        rbotond.setBounds(290, 200, 70, 30);
        add(rbotond);
        grupoBotones.add(rbotond);
        
        rbotons.addItemListener(this);
        rbotonr.addItemListener(this);
        rbotonm.addItemListener(this);
        rbotond.addItemListener(this);
        
        //ComboBox
        combito = new JComboBox();
        combito.addItem("Selecciona operación");
        combito.addItem("Suma");
        combito.addItem("Resta");
        combito.addItem("Multiplicacion");
        combito.addItem("Division");
        combito.setBounds(400, 50, 170, 30);
        combito.setSelectedIndex(0);
        combito.addItemListener(this);
        add(combito);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Datos datito = new Datos();
        datito.setDato1(Integer.parseInt(cuadrito1.getText()));
        datito.setDato2(Integer.parseInt(cuadrito2.getText()));
        
        if(e.getActionCommand().equals("Suma"))
            JOptionPane.showMessageDialog(null, "El resultado es: " + datito.suma());
        
        if(e.getActionCommand().equals("Resta"))
            JOptionPane.showMessageDialog(null, "El resultado es: " + datito.resta());
        
        if(e.getActionCommand().equals("Multi"))
            JOptionPane.showMessageDialog(null, "El resultado es: " + datito.multiplicacion());
        
        if(e.getActionCommand().equals("Div"))
            JOptionPane.showMessageDialog(null , "El resultado es: " + datito.division());
    }

    @Override
    public void itemStateChanged(ItemEvent et) {
        Datos datito2 = new Datos();
        datito2.setDato1(Integer.parseInt(cuadrito1.getText()));
        datito2.setDato2(Integer.parseInt(cuadrito2.getText()));
        String cadena = (String)combito.getSelectedItem();
        if(et.getStateChange() == ItemEvent.SELECTED){
            if(et.getSource() instanceof JComboBox){
                if(et.getSource() == combito){
                    if("Suma".equals(cadena))
                        JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.suma());
                    else
                     if("Resta".equals(cadena))
                         JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.resta());
                     else
                      if("Multi".equals(cadena))
                          JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.multiplicacion());
                      else
                       if("Div".equals(cadena))
                           JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.division());
                }
            }
            else
                if(et.getSource() instanceof JRadioButton){
                    if(rbotons.isSelected() == true)
                        JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.suma());
                    else
                     if(rbotonr.isSelected() == true)
                         JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.resta());
                     else
                      if(rbotonm.isSelected() == true)
                          JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.multiplicacion());
                      else
                       if(rbotond.isSelected() == true)
                           JOptionPane.showMessageDialog(null, "El resultado es: " + datito2.division());
                }
        }
}
}