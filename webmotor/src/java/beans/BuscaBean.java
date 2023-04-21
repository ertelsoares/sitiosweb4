
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import model.Marca;


@Named(value = "buscaBean")
@SessionScoped
public class BuscaBean implements Serializable {

    private Marca marcaSelecionada;
    public BuscaBean() {
    }

    public Marca getMarcaSelecionada() {
        return marcaSelecionada;
    }

    public void setMarcaSelecionada(Marca marcaSelecionada) {
        this.marcaSelecionada = marcaSelecionada;
    }
    
    
    
}
