
package beans;

import dao.MarcaDao;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import model.Marca;

@Named("aplicao")
@ApplicationScoped
public class AplicacaoBean {
    private MarcaDao marcaDao;
    
    public AplicacaoBean(){
      
      
    }
    @PostConstruct
      public void iniciar(){
        marcaDao = new MarcaDao();
        Marca m  = new Marca(1,"Volkswagen");
        marcaDao.inserir(m);
        m = new Marca(2,"Ford");
        marcaDao.inserir(m);
        m = new Marca(3,"Fiat");
        marcaDao.inserir(m);
     }
}
