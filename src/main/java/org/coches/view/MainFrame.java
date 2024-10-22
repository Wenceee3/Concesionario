package org.coches.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.URL;

public class MainFrame extends JFrame {
    private JTextField marcaField;
    private JTextField modeloField;
    private JTextField matriculaField;
    private JTextField anioField;
    private JTextField fechaField;

    private JTextArea cochesArea;

    private JLabel logo;

    private JButton agregarButton;
    private JButton listarButton;

    public MainFrame() {
        setTitle("Concesionario");
        setSize(900, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        logo = new JLabel();
        ImageIcon logoIcon = new ImageIcon("src/main/resources/imagen.png");
        logo.setIcon(logoIcon);

        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(new GridLayout(6, 2));


        inputPanel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        inputPanel.add(marcaField);

        inputPanel.add(new JLabel("Modelo:"));
        modeloField = new JTextField();
        inputPanel.add(modeloField);

        inputPanel.add(new JLabel("Matricula:"));
        matriculaField = new JTextField();
        inputPanel.add(matriculaField);

        inputPanel.add(new JLabel("Año:"));
        anioField = new JTextField();
        inputPanel.add(anioField);

        inputPanel.add(new JLabel("Fecha:"));
        fechaField = new JTextField();
        inputPanel.add(fechaField);

        agregarButton = new JButton("Agregar Coche");
        inputPanel.add(agregarButton);

        listarButton = new JButton("Listar Coche");
        inputPanel.add(listarButton);

        add(inputPanel, BorderLayout.NORTH);

        cochesArea = new JTextArea();
        add(new JScrollPane(cochesArea), BorderLayout.CENTER);
        
        add(logo, BorderLayout.CENTER);

    }

    public String getMarca() {
        return marcaField.getText();
    }

    public String getModelo() {
        return modeloField.getText();
    }

    public String getMatricula() {
        return matriculaField.getText();
    }

    public String getAnio() {
        return anioField.getText();
    }

    public String getFecha() {
        return fechaField.getText();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarCoches(String coches) {
        cochesArea.setText(coches);
    }

    public void setAgregarButtonListener(ActionListener listener) {
        agregarButton.addActionListener(listener);
    }

    public void setListarButtonListener(ActionListener listener) {
        listarButton.addActionListener(listener);
    }
}
