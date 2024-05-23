package GUI.Tugas;

import java.awt.event.*;
import javax.swing.*;

public class TugasGui extends JFrame {
    private static final long serialVersionUID = 1L;

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu("File");
    private JMenu menuEdit = new JMenu("Edit");
    private JMenu menuHelp = new JMenu("Help");
    private JMenuItem menuItemOpen = new JMenuItem("Open");
    private JMenuItem menuItemClose = new JMenuItem("Close");
    private JMenuItem menuItemQuit = new JMenuItem("Quit");
    private JMenuItem menuItemAbout = new JMenuItem("About");
    private JMenuItem menuItemCopy = new JMenuItem("Copy");
    private JMenuItem menuItemPaste = new JMenuItem("Paste");
    private JMenuItem menuItemCut = new JMenuItem("Cut");

    private JLabel labelNama = new JLabel("Nama");
    private JTextField fieldNama = new JTextField(30);
    private JLabel labelTglLahir = new JLabel("Tanggal Lahir");
    private JTextField fieldTglLahir = new JTextField(30);
    private JLabel labelNomor = new JLabel("No. Pendaftaran");
    private JTextField fieldNomor = new JTextField(30);
    private JLabel labelAlamat = new JLabel("Alamat");
    private JTextField fieldAlamat = new JTextField(30);
    private JLabel labelEmail = new JLabel("E-mail");
    private JTextField fieldEmail = new JTextField(30);
    private JButton buttonSubmit = new JButton("Submit");

    public TugasGui() {
        setTitle("DATA MAHASISWA");
        setLocation(300, 100);
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setupComponents();
        setupActions();
    }

    private void setupComponents() {
        setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);

        menuFile.add(menuItemOpen);
        menuFile.add(menuItemClose);
        menuFile.add(menuItemQuit);
        menuEdit.add(menuItemCopy);
        menuEdit.add(menuItemPaste);
        menuEdit.add(menuItemCut);
        menuHelp.add(menuItemAbout);

        menuItemClose.setEnabled(false);

        setLayout(null);

        // Add and position components
        add(labelNama);
        labelNama.setBounds(10, 10, 200, 20);
        add(fieldNama);
        fieldNama.setBounds(115, 10, 200, 20);

        add(labelTglLahir);
        labelTglLahir.setBounds(10, 40, 200, 20);
        add(fieldTglLahir);
        fieldTglLahir.setBounds(115, 40, 200, 20);

        add(labelNomor);
        labelNomor.setBounds(10, 70, 200, 20);
        add(fieldNomor);
        fieldNomor.setBounds(115, 70, 200, 20);

        add(labelAlamat);
        labelAlamat.setBounds(10, 100, 70, 20);
        add(fieldAlamat);
        fieldAlamat.setBounds(115, 100, 200, 40);

        add(labelEmail);
        labelEmail.setBounds(10, 150, 80, 20);
        add(fieldEmail);
        fieldEmail.setBounds(115, 150, 200, 20);

        add(buttonSubmit);
        buttonSubmit.setBounds(200, 180, 100, 20);
    }

    private void setupActions() {
        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JTextArea textAreaOutput = new JTextArea();
                textAreaOutput.append("Nama: " + fieldNama.getText() + "\n");
                textAreaOutput.append("Tanggal Lahir: " + fieldTglLahir.getText() + "\n");
                textAreaOutput.append("No. Pendaftaran: " + fieldNomor.getText() + "\n");
                textAreaOutput.append("Alamat: " + fieldAlamat.getText() + "\n");
                textAreaOutput.append("E-mail: " + fieldEmail.getText() + "\n");
                JOptionPane.showMessageDialog(null, textAreaOutput.getText(), "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TugasGui().setVisible(true);
            }
        });
    }
}