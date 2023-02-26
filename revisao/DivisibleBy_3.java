package revisao;

import javax.swing.JOptionPane;

public class DivisibleBy_3 {
    //Atributo,protegido
    private Double valor;
    //Construtor,vazio
    public DivisibleBy_3(){}
    //set e get
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Double getValor() {
        return valor;
    }
    //Método especial,
    public void quantidade(){
       double amount = 0;
        if (valor % 3 == 0) {
            for (int i = 0; i < valor; i++) {

                if (valor % i == 0) {
                    amount++;
                }

            }
            JOptionPane.showMessageDialog(null, "O número: "+getValor()+" é divisivel por 3. Sua quantidade de divisores é : " + amount + " .");
        } 
        else {
            JOptionPane.showMessageDialog(null, "O número: " + getValor() + " Não é divisivel por 3.");
        }

       
    }
}
