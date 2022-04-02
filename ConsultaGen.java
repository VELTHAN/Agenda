import javax.swing.*;
import java.awt.*;
import java.util.*;
public class ConsultaGen extends JPanel {
    JTable tabla;
    JScrollPane scroll = new JScrollPane();
    Agenda v = new Agenda();
    ArrayList<Persona> datosPer = new ArrayList<Persona>();
    
    public ConsultaGen() {
        datosPer = v.Datos();
        String titulos [] = {"Nombre", "Telefono", "Correo Electronico", "Fecha de cumpleaños"};
        String info [][] = obtenerDatos();
        setLayout (new GridLayout(2,1));
        tabla = new JTable(info, titulos);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scroll.setViewportView(tabla);
        add(scroll);
    }
    
    private String[][] obtenerDatos() {
    int x=0;
    String informacion[][] = new String[datosPer.size()][5];
    Iterator<Persona> itrPersona = datosPer.iterator();
    while(itrPersona.hasNext()){
       Persona persona = itrPersona.next();
       informacion[x][0] = persona.getNombre();
       informacion[x][1] = persona.getTelefono();
       informacion[x][2] = persona.getCorreo();
       informacion[x][3] = persona.getFechaCumple();
       x++;
     }
   return informacion;
  }

}