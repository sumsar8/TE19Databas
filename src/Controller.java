import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.util.Objects;


public class Controller {
    private model model;
    private view view;
    private DatabaseConnector dbc;
    public Controller() {
        view = new view();
        model = new model();
        dbc = new DatabaseConnector();
        JFileChooser fileChooser = new JFileChooser();

        JScrollPane scroll = new JScrollPane(model.getList(), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        view.setScrollPane(scroll);

        JFrame frame = new JFrame("Meeps");
        frame.add(view.getControllPane(), BorderLayout.PAGE_START);
        frame.add(view.getScrollPane(), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 500);

        System.out.println(dbc.getDatabaseContent());

        view.getLäggTillButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        view.getSparaButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser.showSaveDialog(null);
                String path = fileChooser.getSelectedFile().getAbsolutePath();
            }
        });
    }

    public static void main(String[] args) {
        Controller c = new Controller();
    }
}