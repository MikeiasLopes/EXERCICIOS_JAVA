import javax.swing.*;

public class EXERCICIO_1_002_JanelaConversaoNumeros {
    public static void main(String[] args) {

        // Converta os números.

        String numero = JOptionPane.showInputDialog("Digite um número ");
        byte num1 = Byte.parseByte(numero);
        short num2 = Short.parseShort(numero);
        int num3 = Integer.parseInt(numero);
        long num4 = Long.parseLong(numero);
        float num5 = Float.parseFloat(numero);
        double num6 = Double.parseDouble(numero);


        JOptionPane.showMessageDialog(null, "Os números convertidos são ?\n " +
                                              "Byte: " + num1 + " \n " + "Short: " + num2 + " \n "+ "Integer: " + num3 + " \n "
                                              + "Long: " + num4 + " \n " + "Float: " + num5 + " \n " + "Double: " + num6 );

    }

}
