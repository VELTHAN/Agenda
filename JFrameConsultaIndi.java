import javax.swing.*;
import java.awt.*;
public class JFrameConsultaIndi extends JFrame {
    ConsultaIndi mostrar = new ConsultaIndi();
    
    public JFrameConsultaIndi() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(450, 200);
        setTitle("Consultar Persona");
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);
    }
}