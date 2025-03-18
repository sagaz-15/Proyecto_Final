/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto.marcadores;

/**
 *
 * @author robin
 */
public Marcador(){
    this.categoria = "";
    this.titulo= "";
    this.url= "";
}
public String getUrl() {
    return this.url;
}
public void setUrl(String url) {
    this.url = url;
}
public String getTitulo() {
    return this.titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getCategoria() {
    return this.categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public void informacion(){
    System.out.println("URL: " + url + "\nNombre: " + titulo + "\nCategoria: " + categoria);
}
