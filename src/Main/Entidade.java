

package Main;

//@author Radames J Halmeman  - rjhalmeman@gmail.com
public class Entidade {
    private int numero;
    private String resultado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getResultado() {
        if (numero%2==0) {
            resultado="par";
        }
        else{
            resultado="ímpar";
        }
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}
