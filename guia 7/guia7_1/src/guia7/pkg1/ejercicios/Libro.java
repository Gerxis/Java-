/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.pkg1.ejercicios;

/**
 *
 * @author ALEXIS
 */
public class Libro {
    
    public String isbn ;
    public String titulo ;
    public String autor;
    public int numDePag;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numDePag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numDePag = numDePag;
    }
    
    public void IngreseDatos(String isbn ,String titulo , String autor ,int numDepag){
        
        this.isbn = isbn;
        this.autor = autor ;
        this.titulo = titulo;
        this.numDePag = numDePag;
        
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numDePag=" + numDePag + '}';
    }
    
    
}
