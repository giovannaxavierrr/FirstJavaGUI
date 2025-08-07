import javax.swing.*;
import java.awt.*;

public class Desafio {
    
    public static void main(String[] args) {

        //cria a janela
        JFrame frame = new JFrame("Poupex");
        frame.setSize(400, 200);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //painel principal com layout vertical (empilha os elementos)
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); //espaçamento entre os componentes

        //titulo "Juros ao mes"
        JLabel jurosAoMes = new JLabel("Juros ao mes %:");
        jurosAoMes.setFont(new Font("Arial", Font.BOLD, 14));

        //campo para escrever os juros
        JTextField campoJuros = new JTextField();
        campoJuros.setFont(new Font("Arial", Font.ITALIC, 14));

        //titulo "num de anos"
        JLabel numDeAnos = new JLabel("Num. de anos:");
        numDeAnos.setFont(new Font("Arial", Font.BOLD, 14));

        //campo para escrever o num de anos
        JTextField campoAnos = new JTextField();
        campoAnos.setFont(new Font("Arial", Font.ITALIC, 14));

        //titulo "deposito mensal"
        JLabel depositoMensal = new JLabel("Deposito mensal R$:");
        depositoMensal.setFont(new Font("Arial", Font.BOLD, 14));

        //campo para escrever o valor do deposito mensal
        JTextField campoDeposito = new JTextField();
        campoDeposito.setFont(new Font("Arial", Font.ITALIC, 14));

        //titulo "total poupado"
        JLabel totalPoupado = new JLabel("Total poupado R$:");
        totalPoupado.setFont(new Font("Arial", Font.BOLD, 14));

        //campo onde aparecera o valor total poupado
        JLabel resultadoValor = new JLabel("");
        resultadoValor.setFont(new Font("Arial", Font.BOLD, 14));

        //botao OK
        JButton button = new JButton("OK");
        button.setPreferredSize(new Dimension(200, 30));

        //ação para quando apertar o botao, aparecer o resultado
        button.addActionListener (e -> {
            try{

                double jurosPorcentagem = Double.parseDouble(campoJuros.getText()) / 100;
                double valor = Double.parseDouble(campoDeposito.getText());
                double valorJurosMes = valor * jurosPorcentagem;
                double anosEmMes = Double.parseDouble(campoAnos.getText()) * 12;

                double total = (valor + valorJurosMes) * anosEmMes;

                resultadoValor.setText(String.format("%.2f", total));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Preencha os campos corretamente com numeros.");
            }
        }); //try catch executa o que estiver no try, se der algum erro executará o catch

        //painel para alinhar o botao a direita
        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        painelBotao.add(button);

        panel.add(jurosAoMes);
        panel.add(campoJuros);
        panel.add(numDeAnos);
        panel.add(campoAnos);
        panel.add(depositoMensal);
        panel.add(campoDeposito);
        panel.add(totalPoupado);
        panel.add(resultadoValor);
        panel.add(new JLabel(""));
        panel.add(painelBotao);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
