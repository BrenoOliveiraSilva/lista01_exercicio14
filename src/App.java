import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double weight = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (!validInput) {
            String input = JOptionPane.showInputDialog(null, "Informe quantos quilos de peixe você trouxe");
            try {
                weight = Double.parseDouble(input);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        if (weight > 50) {
            double excessWeight = weight - 50;
            double fine = excessWeight * 4;
            JOptionPane.showMessageDialog(null, "Você excedeu o limite estabelecido pelo regulamento de pesca do estado de São Paulo em " + numberFormat.format(excessWeight) + " quilos e terá que pagar uma multa de R$ " + fine);
        } else if (weight <= 50 && weight > 0) {
            JOptionPane.showMessageDialog(null, "Você não excedeu o limite então não terá que pagar multa");
        } else {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    }
}