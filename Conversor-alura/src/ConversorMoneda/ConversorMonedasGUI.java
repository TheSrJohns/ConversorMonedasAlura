package ConversorMoneda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

public class ConversorMonedasGUI extends JFrame {
    private JComboBox<String> monedaOrigenComboBox;
    private JComboBox<String> monedaDestinoComboBox;
    private JTextField valorTextField;
    private JLabel resultadoLabel;

    public ConversorMonedasGUI() {
        super("Conversor de Monedas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout());

        // Componentes de la GUI
        monedaOrigenComboBox = new JComboBox<>(new String[]{"Euro", "Dólar", "Yen", "Sol Peruano"});
        monedaDestinoComboBox = new JComboBox<>(new String[]{"Euro", "Dólar", "Yen", "Sol Peruano"});
        valorTextField = new JTextField(10);
        resultadoLabel = new JLabel("Resultado:");

        JButton convertirButton = new JButton("Convertir");
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirMoneda();
            }
        });

        // Panel para el input y el botón
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Valor: "));
        inputPanel.add(valorTextField);
        inputPanel.add(monedaOrigenComboBox);
        inputPanel.add(new JLabel("a"));
        inputPanel.add(monedaDestinoComboBox);
        inputPanel.add(convertirButton);

        // Panel para el resultado
        JPanel resultadoPanel = new JPanel();
        resultadoPanel.add(resultadoLabel);

        // Agregar paneles a la ventana
        add(inputPanel, BorderLayout.CENTER);
        add(resultadoPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void convertirMoneda() {
        try {
            String monedaOrigen = (String) monedaOrigenComboBox.getSelectedItem();
            String monedaDestino = (String) monedaDestinoComboBox.getSelectedItem();
            double valor = Double.parseDouble(valorTextField.getText());

            Moneda moneda;

            switch (monedaOrigen) {
                case "Euro":
                    moneda = new Euro(valor);
                    break;
                case "Dólar":
                    moneda = new Dolar(valor);
                    break;
                case "Yen":
                    moneda = new Yen(valor);
                    break;
                case "Sol Peruano":
                    moneda = new SolPeruano(valor);
                    break;
                default:
                    throw new IllegalArgumentException("Moneda de origen no válida.");
            }
        }finally {}
    }
}


            

