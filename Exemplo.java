import javax.swing.*;
import java.awt.*;

public class Exemplo {
    
    public static void main (String[] args) {

        //cria a janela
        JFrame frame = new JFrame("Best TV Show Evaaa");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //painel principal com layout vertical (empilha os elementos)
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); /*BoxLayout coloca tudo automaticamente embaixo um do outro 
                                                                   (os elementos não vão ficar no mesmo lugar), ele empilha tudo verticalmente*/
        JScrollPane scrollPane = new JScrollPane(panel);

        //titulo centralizado
        JLabel label = new JLabel("Ross and Rachel");
        label.setAlignmentX(Component.CENTER_ALIGNMENT); //centraliza no layout
        label.setFont(new Font("Serif", Font.ITALIC, 40));
        label.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0)); //espaçamento

        //carrega a imagem
        ImageIcon imagemCasal = new ImageIcon("theCouple.png"); //imagem pequena
        JLabel imageLabel = new JLabel(imagemCasal);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT); //centraliza no layout

        //botão
        JButton button = new JButton("They were on a break");
        //button.setBackground(Color.LIGHT_GRAY);
        //button.setForeground(Color.pink);
        button.setPreferredSize(new Dimension(200, 30));
        //button.setSize(100, 30);

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Yes they were, but that doesn't mean what he did wasn't wrong", "Conclusion", 1);
        });

        JButton button1 = new JButton("They were not on a break!");
        //button1.setBackground(Color.LIGHT_GRAY);
        //button1.setForeground(Color.pink);
        button1.setPreferredSize(new Dimension(200, 30));
        //button1.setSize(100, 30);

        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "She asked for them to go on a break, but that doesn't give him the right to hook up with someone else, they were not over oficially", "Conclusion", 1);
        });

        //painel de botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        painelBotoes.setBackground(Color.pink);
        painelBotoes.add(button);
        painelBotoes.add(button1);

        //titulo do outro casal
        JLabel titulo2 = new JLabel("Bells and Jeremiah");
        titulo2.setAlignmentX(Component.CENTER_ALIGNMENT); //centraliza no layout
        titulo2.setFont(new Font("Serif", Font.ITALIC, 40));

        //imagem do pior casal
        ImageIcon piorCasal = new ImageIcon("bellandjeremiah.png");
        JLabel segundoCasal = new JLabel(piorCasal);
        segundoCasal.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button2 = new JButton("They're right for each other");
        button2.setPreferredSize(new Dimension(200,30));

        button2.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "No they're not, Bells's true love is Conrad, and Jeremiah only proposed to her because he cheated on her", "Conclusion", 1);
        });

        JButton button3 = new JButton("Most wrong marriage!");
        button3.setPreferredSize(new Dimension(200, 30));

        button3.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Correct, Steve was in the hospital, they were fragile, had just had a fight, Jeremiah cheated on her TWICE and they weren't speaking before that talk, it wasn't a planned proposal, he didn't have a ring, no good thing can come out of this", "Conclusion", 1);
        });

        JPanel botoesChoices = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        botoesChoices.setBackground(Color.pink);
        botoesChoices.add(button2);
        botoesChoices.add(button3);

        panel.add(label);
        panel.add(imageLabel);
        panel.add(painelBotoes);
        panel.add(titulo2);
        panel.add(segundoCasal);
        panel.add(botoesChoices);
        frame.add(scrollPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
