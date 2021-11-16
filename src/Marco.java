import javax.swing.*;
public class Marco extends JFrame{
    JLabel et;
    JButton btn;
    JTextField entrada;
    JTextArea area;
     Marco(){
    //Propiedades del marco
    setLayout(null);
    setTitle("Mi marco");
    setBounds(300,300,300,300);
     //Etiqueta
    et = new JLabel("Hola mundo");
    et.setBounds(20,20,100,30);
    add(et);
    //Botón
    btn = new JButton("Presione aquí");
    btn.setBounds(20,70,100,40);
    add(btn);
    //Campo de texto
    entrada = new JTextField();
    entrada.setBounds(20,120,100,40);
    add(entrada);
    //Area de texto
    area = new JTextArea("Escribe aquí");
    area.setBounds(20,170,120,70);
    add(area);
    }
    
    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}
