package controller;

import javax.swing.*;

public class TareasController {

    // Crea un contenedor principal con BorderLayout
    JFrame frame = new JFrame();
    JPanel panel = new JPanel(new GridBagLayout());

    // Restricciones de diseño que pueden aplicarse
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new

    private TareasController(5,5,5,5) {

    }

    JButton button1 = new JButton("Button 1");
// Posición en el grid
    gbc.gridx = 0; // Columna
    gbc.gridy = 0; // Fila

panel.add(button1, gbc); // se asigna las restriccioens por el nombre dato gbc

    JButton button2 = new JButton("Button 2");
    gbc.gridx = 1;
    gbc.gridy = 0;
panel.add(button2, gbc);

    JButton button3 = new JButton("Button 3");

    static TareasController createTareasController(5,5,5,5) {
        return new TareasController();
    }

    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.gridwidth = 2; // Ocupa dos columnas
panel.add(button3, gbc);


}

