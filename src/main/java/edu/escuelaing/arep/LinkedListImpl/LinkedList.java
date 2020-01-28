/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.LinkedListImpl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import edu.escuelaing.arep.LinkedListImpl.Node;

/**
 * Implementacion de un LinkedList 
 * 
 * @author santiago.vega-r
 */
public class LinkedList<T> implements List<T> {
    
    int size;
    Node head;
    
    /**
     * Constructor para una lista vacia
     */
    public LinkedList(){
        size=0;
        head=null;
    }
    
    /**
     * Agrega un dato a la lista
     * @param data dato a insertar
     * @return True
     */
    @Override
    public boolean add(T data) {
        if(head == null){
            head=new Node<T>(data,null);
            size+=1;
            return true;
        } 
        else
        {
           Node<T> tmp = head;
           while(tmp.getNext() != null) tmp = tmp.getNext();

           tmp.setNext(new Node<T>(data, null));
           size+=1;
           return true;
        }
    }
    
    /**
     * Remueve un elemento dado el indice
     * @param index indice a remover
     * @return El objeto removido
     */
    @Override
    public T remove(int index) {
        if (head==null) return null;
        if (index>=size) return null; 
        
        Node<T> tmp = head;
        Node<T> prev = null;
        for (int i=0;i<index;i++){
            prev=tmp;
            tmp=tmp.getNext();
        }
        prev.setNext(tmp.getNext());
        size-=1;
        return tmp.getData();
    }
    
    /**
     * Remueve el objeto dado
     * @param o Objeto a remover
     * @return True si el objeto fue removido, False si no
     */
    public boolean removeForObject(Object o) {
        if (head==null) return false;
        
        if (head.getData().equals(o)){
            head=head.getNext();
            return true;
        }
        
        Node<T> tmp = head;
        Node<T> prev = null;
        while (tmp!=null && !tmp.getData().equals(o)){
            prev=tmp;
            tmp=tmp.getNext();
        }
        
        if (tmp==null) return false;
        
        prev.setNext(tmp.getNext());
        size-=1;
        
        return true;
        
    }
    
    /**
     * Retorna un iterador para la lista
     * @return El iterador de la lista
     */
    @Override
    public Iterator<T> iterator() {
         return new Iterator<T>() {

            Node<T> tmp = head;

            public boolean hasNext() {
                return tmp != null;
            }

            public T next() {
                T data = tmp.getData();
                tmp = tmp.getNext();
                return data;
            }
        };
    }
    
    /**
     * Retorna el tamaño de la lista
     * @return El tamaño de la lista
     */
    @Override
    public int size() {
        return size;
    }
    
    /**
     * Retorna si la lista esta o no vacia
     * @return True si la lista esta vacia, False si no
     */
    @Override
    public boolean isEmpty() {
        if (size==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Retorna un objeto de la lista dado su indice
     * @return Un objeto de la lista
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Iterator<T> iterator = iterator();
        for (int i=0;i<index;i++){
            iterator.next();
        }
        return iterator.next();
    }
    
    public String print(){
        String lh="";
        Node<T> tmp = head;
        while(tmp.getNext() != null){
            lh=lh+" "+tmp.getData();
            tmp = tmp.getNext();
        } 
         lh=lh+" "+tmp.getData();
         return lh;
    }
    

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
}
