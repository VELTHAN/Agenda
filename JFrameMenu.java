import javax.swing.*;
import java.awt.*;
public class JFrameMenu extends JFrame{
    Menu mostrar = new Menu();
    
    public JFrameMenu() {
        initComponents();
    }
    
    private void initComponents() {
        this.setEnabled(true);
        setSize(200, 200);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(mostrar);
        setVisible(true);
    }
}