import javax.swing.*;

public class EXERCICIO_1_001_JanelaOlaMundo {
    public static void main(String[] args) {

        // Crie uma janela com uma frase e um campo de digitação.

        JOptionPane.showMessageDialog(null, " Ótimo dia, cidadão ");

        String nome = JOptionPane.showInputDialog(" Digita aí seu CPF ");
        JOptionPane.showMessageDialog(null, " Dados copiados com sucesso! ");
    }

}