import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menu extends JPanel implements ActionListener {
    private JButton btnAlta, btnConsultaIndi, btnConsultaGen, btnEliminar, btnModificar;
    
    public Menu() {
        btnAlta = new JButton("Dar de alta");
        btnAlta.addActionListener(this);
        btnConsultaIndi = new JButton("Consulta Individual");
        btnConsultaIndi.addActionListener(this);
        btnConsultaGen = new JButton("Consulta General");
        btnConsultaGen.addActionListener(this);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        btnModificar = new JButton("Modificar");
        btnModificar.addActionListener(this);
        add(btnAlta);
        add(btnConsultaIndi);
        add(btnConsultaGen);
        add(btnEliminar);
        add(btnModificar);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAlta) {
            JFrameAlta Alta = new JFrameAlta();
        }
        
        if(e.getSource() == btnConsultaIndi) {
            JFrameConsultaIndi conIndi = new JFrameConsultaIndi();
        }
        
        if(e.getSource() == btnConsultaGen) {
            JFrameConsultaGen conGen = new JFrameConsultaGen();
        }
    }
}