import javax.swing.*;

public class EXERCICIO_1_003_ShowMessageDialog {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, " ATENÇÃO! ");

        String nome = JOptionPane.showInputDialog(" Digita aí seu nome ");
        JOptionPane.showMessageDialog(null, " EXCELENTE ");

        String numero = JOptionPane.showInputDialog("Digite um número ");
        Byte num1 = Byte.parseByte(numero);
        Short num2 = Short.parseShort(numero);
        Integer num3 = Integer.parseInt(numero);
        Long num4 = Long.parseLong(numero);
        Float num5 = Float.parseFloat(numero);
        Double num6 = Double.parseDouble(numero);

        JOptionPane.showMessageDialog(null, "Os números convertidos são ?\n " +
               "Byte: " + num1 + " \n " + "Short: " + num2 + " \n "+ "Integer: " + num3 + " \n "
                + "Long: " + num4 + " \n " + "Float: " + num5 + " \n " + "Double: " + num6 );

    }
}
