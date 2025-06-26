/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lists;

/**
 *
 * @author Dylan
 */
public interface List <T> { //Interfaz generica//
    
    public boolean add (T t);
    
    public T find(Object id);
    
    public boolean remove(T t);
    
    public void showAll();
}
