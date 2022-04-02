import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ingreso extends JPanel implements ActionListener {
    private JButton btnIngresar, btnSalir;
    private JTextField txtUsuario;
    private JPasswordField passContra;
    
    public Ingreso() {
        setLayout(new GridLayout(3,2));
        JLabel lblUsuario = new JLabel("Usurio: ", JLabel.RIGHT);
        txtUsuario = new JTextField(12);
        add(lblUsuario);
        add(txtUsuario);
        
        JLabel lblcontra = new JLabel("Contrase�a: ", JLabel.RIGHT);
        passContra = new JPasswordField(15);
        passContra.setToolTipText("Ingrese Contrase�a");
        add(lblcontra);
        add(passContra);
        
        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(this);
        btnSalir = new JButton("Salir");
        btnSalir.addActionListener(this);
        add(btnIngresar);
        add(btnSalir);
    }
    
    public void actionPerformed(ActionEvent e) {
        String usuario = txtUsuario.getText();
        String contra = new String(passContra.getPassword());
        
        if(e.getSource() == btnIngresar) {
            if(usuario.isEmpty() && contra.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el usuario y contrase�a");
                txtUsuario.requestFocus();
            } else {
                if(usuario.equals("V") && contra.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                    JFrameMenu mostrar = new JFrameMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario o la contrasena es incorrecta");
                    txtUsuario.setText(null);
                    passContra.setText(null);
                    txtUsuario.requestFocus();
                }
            }
        }
        
        if(e.getSource() == btnSalir) {
            
        }
    }
}