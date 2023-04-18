/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.LinkedList;


public abstract class GenericDao<T> {
    private LinkedList<T> lista;
    
    public void inserir(T obj){
        if(!lista.contains(obj)){
            lista.add(obj);
        }
    }
    
    
}
