import javax.swing.*;
import java.awt.*;
public class JFrameIngreso  extends JFrame{
    Ingreso mostrar = new Ingreso();
    public JFrameIngreso() {
        initComponents();
    }
    private void initComponents() {
        this.setEnabled(true);
        setSize(350, 200);
        setTitle("Usuario y Contrase�a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);
    }
}