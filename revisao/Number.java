package revisao;

import javax.swing.JOptionPane;

public class Number {
    // atributo,protegido
    private double number;

    // Construtor,vazio
    public Number() {
    }

    // set e get
    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    // Médtodo especial, verificador
    public void verificar() {
        if (this.number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número: " + getNumber() + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número: " + getNumber() + " é Impar.");
        }
    }
}
