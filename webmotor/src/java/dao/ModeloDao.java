
package dao;

import java.util.LinkedList;
import model.Marca;
import model.Modelo;


public class ModeloDao extends GenericDao<Modelo>{
  public LinkedList<Modelo> filtrarPorMarca(Marca marca){
    LinkedList<Modelo> modelos = new LinkedList<>();
    for (Modelo mod : lista){
        if (mod.getMarca().equals(marca)){
            modelos.add(mod);
        }  
    }
    return modelos;
  }  
}
