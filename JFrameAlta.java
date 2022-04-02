import javax.swing.*;
import java.awt.*;
public class JFrameAlta extends JFrame {
    Alta mostrar = new Alta();
    public JFrameAlta() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(450, 200);
        setTitle("Registrar Persona");
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);
    }
}
