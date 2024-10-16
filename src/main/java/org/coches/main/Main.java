package org.coches.main;

import org.coches.model.*;
import org.coches.controller.*;
import org.coches.view.*;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            CocheManager model = new CocheManager();
            new CocheController(frame, model);
            frame.setVisible(true);
        });
    }
}