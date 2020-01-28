/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.Calculator;

import edu.escuelaing.arep.LinkedListImpl.LinkedList;

/**
 *
 * @author santiago.vega-r
 */
public class Calculator {

    /**
     * Calcula la media de una LinkedList de reales
     * @param list
     * @return Media de la LinkedList
     */
    public static double getMean(LinkedList<Double> list){
        int size = list.size();
        double suma= 0;
        for(Double num:list){
            suma+=num;
        }
        
        return suma/size;
    }
    
    /**
     * Calcula la desviacion estandar de una LinkedList de reales
     * @param list
     * @return Desviacion Estandar de la LinkedList
     */
    public static double getStandardDeviation(LinkedList<Double> list){
        double mean = getMean(list);
        double sumatoria=0;
        int size = list.size();
        
        for(Double num:list){
            sumatoria+= Math.pow(num-mean, 2);
        }
        
        return  Math.sqrt((sumatoria)/(size-1));
    }
}
