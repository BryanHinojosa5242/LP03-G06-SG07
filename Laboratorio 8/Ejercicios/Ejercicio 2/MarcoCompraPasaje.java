package pruebacomprapasaje;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoCompraPasaje extends JFrame {

    private JTextField nombre, documento, fecha;
    private JCheckBox audifonosCasilla, mantaCasilla, revistasCasilla;
    private JRadioButton primerPisoRadio, segundoPisoRadio;
    private JButton mostrarBoton, reiniciarBoton;
    private JComboBox<String> origen, destino;
    private JList<String> calidadServicio;

    public MarcoCompraPasaje() {
        setTitle("Compra de Pasajes");
        setLayout(new GridLayout(9, 2));

        // Etiquetas
        add(new JLabel("Nombre:"));
        nombre = new JTextField();
        add(nombre);

        add(new JLabel("Documento de Identidad:"));
        documento = new JTextField();
        add(documento);

        add(new JLabel("Fecha de Viaje:"));
        fecha = new JTextField();
        add(fecha);

        add(new JLabel("Servicios Opcionales:"));
        JPanel serviciosPanel = new JPanel();
        audifonosCasilla = new JCheckBox("Audífonos");
        mantaCasilla = new JCheckBox("Manta");
        revistasCasilla = new JCheckBox("Revistas");
        serviciosPanel.add(audifonosCasilla);
        serviciosPanel.add(mantaCasilla);
        serviciosPanel.add(revistasCasilla);
        add(serviciosPanel);

        add(new JLabel("Piso de Viaje:"));
        JPanel pisoPanel = new JPanel();
        primerPisoRadio = new JRadioButton("1er Piso");
        segundoPisoRadio = new JRadioButton("2do Piso");
        ButtonGroup pisoGrupo = new ButtonGroup();
        pisoGrupo.add(primerPisoRadio);
        pisoGrupo.add(segundoPisoRadio);
        pisoPanel.add(primerPisoRadio);
        pisoPanel.add(segundoPisoRadio);
        add(pisoPanel);

        add(new JLabel("Origen:"));
        origen = new JComboBox<>(new String[]{"Arequipa", "Lima", "Cuzco"});
        add(origen);

        add(new JLabel("Destino:"));
        destino = new JComboBox<>(new String[]{"Arequipa", "Lima", "Cuzco"});
        add(destino);

        add(new JLabel("Calidad de Servicio:"));
        calidadServicio = new JList<>(new String[]{"Economico", "Standard", "VIP"});
        add(new JScrollPane(calidadServicio));

        reiniciarBoton = new JButton("Reiniciar");
        add(reiniciarBoton);
        
        mostrarBoton = new JButton("Mostrar");
        add(mostrarBoton);

        reiniciarBoton.addActionListener(
            new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nombre.setText("");
                    documento.setText("");
                    fecha.setText("");
                    audifonosCasilla.setSelected(false);
                    mantaCasilla.setSelected(false);
                    revistasCasilla.setSelected(false);
                    primerPisoRadio.setSelected(false);
                    segundoPisoRadio.setSelected(false);
                    origen.setSelectedIndex(0);
                    destino.setSelectedIndex(0);
                    calidadServicio.clearSelection();
                }
            }
        );
        
        mostrarBoton.addActionListener(
            new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String mensajeMostrar = "Nombre: " + nombre.getText()+
                                     "\nDocumento: " + documento.getText() +
                                     "\nFecha de Viaje: " + fecha.getText() +
                                     "\nServicios: " + (audifonosCasilla.isSelected() ? "Audifonos" : " ") +
                                     (mantaCasilla.isSelected() ? "Manta " : " ") + (revistasCasilla.isSelected() ? "Revistas " : " ") +
                                     "\nPiso: " + (primerPisoRadio.isSelected() ? "1er piso" : "2do piso") +
                                     "\nOrigen: " + origen.getSelectedItem() +
                                     "\nDestino: " + destino.getSelectedItem() +
                                     "\nCalidad: " + calidadServicio.getSelectedValue();
                    JOptionPane.showMessageDialog(null, mensajeMostrar, "Resumen de compra", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        );
    }
}
