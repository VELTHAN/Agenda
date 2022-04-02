import javax.swing.*;
import java.awt.*;
public class JFrameConsultaGen extends JFrame{
    ConsultaGen mostrar = new ConsultaGen();
  
    public JFrameConsultaGen() {
        initComponents();
    }
  
    private void initComponents() {
        setSize(350,350);
        setTitle("Contactos Registrados");
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);
    }
}