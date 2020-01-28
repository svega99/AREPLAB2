/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.LinkedListImpl;

/**
 * Implementacion de un nodo para la LinkedList
 * @author santiago.vega-r
 */
public class Node<E> {
    private E data;
    private Node<E> next;
    
    /**
     * Constructor para un nodo con los datos y el nodo siguiente dados
     */
    public Node (E data, Node<E> next){
        this.data=data;
        this.next=next;
    }
    
    /**
     * Cambia el siguiente nodo
     * @param next Nuevo siguiente nodo
     */
    public void setNext(Node<E> next){
        this.next=next;
    }
    
    /**
     * Cambia el dato del nodo
     * @param data Nuevo dato 
     */
    public void setData(E data){
        this.data=data;
    }
    
    /**
     * Retorna el siguiente nodo
     * @return Siguente Nodo
     */
    public Node<E> getNext(){
        return next;
    }
    
    /**
     * Retorna el dato del nodo
     * @return Dato del nodo
     */
    public E getData(){
        return data;
    }
    
    
}
