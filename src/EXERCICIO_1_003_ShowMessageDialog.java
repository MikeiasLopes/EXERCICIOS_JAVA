import javax.swing.*;

public class EXERCICIO_1_003_ShowMessageDialog {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, " Olá, eu sou Kim, seu prefessor de Álgebra Linear ");

        String nome = JOptionPane.showInputDialog("Por favor, qualé seu nome ?:");
        JOptionPane.showMessageDialog(null, " VAI PENAR");

        String numero = JOptionPane.showInputDialog("Digite um número ");
        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        Long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, "Os números convertidos são ?\n " + num1 + " \n " +
                + num2 + " \n " + num3 + " \n " + num4 + " \n " + num5 + " \n " + num6 );

    }
}
