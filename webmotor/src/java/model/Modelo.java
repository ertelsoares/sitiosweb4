
package model;


public class Modelo {
    private int id;
    private String nome;
    private String marca;

    public Modelo(int id, String nome, String marca) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
    }
    
    public Modelo() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
