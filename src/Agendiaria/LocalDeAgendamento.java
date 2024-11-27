package Agendiaria;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocalDeAgendamento {


    private JButton btnRemoveComp;
    private JButton btnAddComp;
    private JTable tbCompromissos;
    private JTextField textField1;
    private JSpinner jsContadorDeDias;
    private JPanel panelInferior;
    private JPanel panelSuperior;
    private JPanel panelSupEsquerdo;
    private JPanel panelSupDireito;
    private JPanel panelAgendamento;
    private String infComprimisso;
    private String infData;

    public LocalDeAgendamento() {

        executNoInicio();

        btnAddComp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void executNoInicio(){

        DefaultTableModel model = (DefaultTableModel) tbCompromissos.getModel();

        if (model.getColumnCount() == 0) {
            model.setColumnIdentifiers(new String[]{"Compromisso", "Data"});
        }

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Local de Agendamento");
        frame.setContentPane(new LocalDeAgendamento().panelAgendamento);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

}
