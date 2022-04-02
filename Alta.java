import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Alta extends JPanel implements ActionListener {
    private JButton btnBuscar, btnGuardar, btnCancelar;
    private JTextField txtNombre, txtTelefono, txtCorreo, txtFechaCum;
    Agenda v = new Agenda();
    
    public Alta() {
        setLayout(new GridLayout(7, 2));
        JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
        txtNombre = new JTextField(15);
        add(lblNombre);
        add(txtNombre);
        
        JLabel lblTelefono = new JLabel("Numero de Celular: ", JLabel.RIGHT);
        txtTelefono = new JTextField(15);
        add(lblTelefono);
        add(txtTelefono);
        
        JLabel lblCorreo = new JLabel("Correo electronico: ", JLabel.RIGHT);
        txtCorreo = new JTextField(20);
        add(lblCorreo);
        add(txtCorreo);
        
        JLabel lblFechaCum = new JLabel("Fecha de cumpleaños: ", JLabel.RIGHT);
        txtFechaCum = new JTextField(15);
        add(lblFechaCum);
        add(txtFechaCum);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this);
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(this);
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        add(btnBuscar);
        add(btnGuardar);
        
        txtTelefono.setEditable(false);
        txtCorreo.setEditable(false);
        txtFechaCum.setEditable(false);
        btnGuardar.setEnabled(false);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBuscar) {
            if(txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debes de colocar el nombre para buscar",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
            } else {
                String nombre = txtNombre.getText();
                int n = v.getPersona(nombre);
                if(n != -2) {
                    JOptionPane.showMessageDialog(this,
                            "Este nombre ya esta registrado en la agenda",
                            "Nombre repetido",
                    JOptionPane.ERROR_MESSAGE);
                } else {
                    txtTelefono.setEditable(true);
                    txtCorreo.setEditable(true);
                    txtFechaCum.setEditable(true);
                    btnGuardar.setEnabled(true);
                }
            }
        }
        if(e.getSource() == btnGuardar) {
            v.agregar(txtNombre.getText(), txtTelefono.getText(), txtCorreo.getText(), txtFechaCum.getText());
            JOptionPane.showMessageDialog(null, "Se guardaran los datos",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
            txtNombre.setText(null);
            txtTelefono.setText(null);
            txtCorreo.setText(null);
            txtFechaCum.setText(null);
            
            txtTelefono.setEditable(false);
            txtCorreo.setEditable(false);
            txtFechaCum.setEditable(false);
            btnGuardar.setEnabled(false);
        } 
    }
}