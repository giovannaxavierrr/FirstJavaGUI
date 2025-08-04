import java.awt.*;
import javax.swing.*;

public class PrimeiroApp {

    public static void main (String[] args) {
        System.out.println("Ola mundo GUI!");

        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300); //400 pixels de largura, e 300 pixels de altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Clique em mim!");
        button.setBackground(Color.PINK);
        button.setForeground(Color.WHITE);
        button.setSize(40, 30);


        JTextField textField = new JTextField(15);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        JLabel label = new JLabel("O Insta mais bonito: ");
        label.setFont(new Font("Serif", Font.BOLD, 36));

        //Adiciona um Listener no clique do botão
        button.addActionListener(e -> { //a flechinha é um arrow function, uma seta de função
            JOptionPane.showMessageDialog(null, textField.getText(), "Daily Reminder", 1);
        });


        JButton button1 = new JButton("Nao clique em mim!");
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.PINK);
        button1.setSize(40, 30);

        JTextArea textArea = new JTextArea("@giovannaxavierrr");
        //JTextArea textArea1 = new JTextArea("@giovannaxavierrr");

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(button, BorderLayout.SOUTH);
        //panel.add(button1, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.CENTER);
        //panel.add(textArea1, BorderLayout.WEST);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        


    }
}