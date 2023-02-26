package revisao;

import javax.swing.JOptionPane;

public class Ordenacao {
    // atributos,protegidos
    private double x;
    private double y;
    private double z;

    // construtor,vazio
    public Ordenacao() {
    }

    // set e get
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Método especial, ordem
    public void ordem() {

        // x em primeiro maior
        if (this.x > this.y && this.x > this.z) {
            if (this.y > this.z) {
                JOptionPane.showMessageDialog(null, getZ() + " , " + getY() + " , " + getX());
            } else {
                JOptionPane.showMessageDialog(null, getY() + " , " + getZ() + " , " + getX());
            }

        }

        // y em primeiro maior
        else if (this.y > this.x && this.y > this.z) {
            if (this.x > this.z) {
                JOptionPane.showMessageDialog(null, getZ() + " , " + getX() + " , " + getY());
            } else {
                JOptionPane.showMessageDialog(null, getX() + " , " + getZ() + " , " + getY());
            }

        }

        // z em primeiro
        else if (this.z > this.x && this.z > this.y) {
            if (this.x > this.y) {
                JOptionPane.showMessageDialog(null, getY() + " , " + getX() + " , " + getZ());
            } else {
                JOptionPane.showMessageDialog(null, getX() + " , " + getY() + " , " + getZ());
            }

        } else {

            // x == y e z maior ou menor
            if (this.z > this.x && this.x == this.y) {

                JOptionPane.showMessageDialog(null, getY() + " , " + getX() + " , " + getZ());
            } else if (this.z < this.x && this.x == this.y) {
                JOptionPane.showMessageDialog(null, getZ() + " , " + getY() + " , " + getX());
            }

            // x == z e y maior ou menor
            else if (this.y > this.x && this.x == this.z) {

                JOptionPane.showMessageDialog(null, getZ() + " , " + getX() + " , " + getY());
            } else if (this.y < this.x && this.x == this.z) {
                JOptionPane.showMessageDialog(null, getY() + " , " + getZ() + " , " + getX());
            }

            // z == y e x maior ou menor
            else if (this.x > this.y && this.y == this.z) {

                JOptionPane.showMessageDialog(null, getZ() + " , " + getY() + " , " + getX());
            } else if (this.x < this.y && this.y == this.z) {
                JOptionPane.showMessageDialog(null, getX() + " , " + getZ() + " , " + getY());
            }

            // Todos iquais
            else if (this.x == this.y && this.x == this.z) {

                JOptionPane.showMessageDialog(null, getX() + " , " + getY() + " , " + getZ());
            }

        }

    }

}
