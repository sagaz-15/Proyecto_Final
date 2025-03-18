/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.historial;

/**
 *
 * @author robin
 */
public class Nodo<T> {
    private Nodo<T> sig;
    private Nodo<T> ant;
    private  T dato;

    public Nodo (){
        this.sig = null;
        this.ant = null;
    }

    public Nodo<T> getSig() {
        return this.sig;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }

    public Nodo<T> getAnt() {
        return this.ant;
    }

    public void setAnt(Nodo<T> ant) {
        this.ant = ant;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
