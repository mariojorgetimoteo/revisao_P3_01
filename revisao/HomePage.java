package revisao;

import javax.swing.JOptionPane;

public class HomePage {
    public static void main(String[] args) {

        //                      Questão 1
        // meu acesso meu Number
        Number number;
        number = new Number();
        // Entrada de dados Number
        number.setNumber(Double.parseDouble(JOptionPane.showInputDialog(null, "Questão 1. Digite um número:")));
        // Saida de dados Number
        number.verificar();

        //                      Questão 2
        // meu acesso meu DivisibleBy_3
        DivisibleBy_3 divisibleBy_3;
        divisibleBy_3 = new DivisibleBy_3();
        // Entrada de dados 
        divisibleBy_3.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Questão 2 .Digite um valor:")));
       // saida de dados
        divisibleBy_3.quantidade();

        //                      Questão 3
        // meu acesso meu Ordenacao
        Ordenacao ordenacao;
        ordenacao = new Ordenacao();
        //Entrada de dados
        ordenacao.setX(Double.parseDouble(JOptionPane.showInputDialog(null, "Questão 3 .Digite o primeiro valor:")));
        ordenacao.setY(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor:")));
        ordenacao.setZ(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro valor:")));
        // saida de dados
        ordenacao.ordem();
    }
}