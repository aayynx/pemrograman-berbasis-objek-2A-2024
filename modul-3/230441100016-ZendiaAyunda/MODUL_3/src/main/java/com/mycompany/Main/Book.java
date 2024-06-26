/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author sindy
 */

// parent class atau super class
public class Book {
    String Judul;
    String Penulis;
    String Publisher;
    String Kategori;


    public Book(String Judul, String Penulis, String Publisher, String Kategori) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Publisher = Publisher;
        this.Kategori = Kategori;
    }

    public void display() {
        System.out.println("--------------------------------------");
        System.out.println("Judul       : "+ Judul);
        System.out.println("Penerbit    : "+ Publisher);
        System.out.println("Penulis     : "+ Penulis);
        System.out.println("Kategori    : "+ Kategori);
        System.out.println("--------------------------------------");
    }

    public String SU() {
        return "[SU] Semua Umur";
    }
    public String D(){
        return "[D] Dewasa";
    }
    public String R(){
        return "[R] Remaja";
    }
    public String A(){
        return "[A] Anak-anak";
    }
    public String No(){
        return "Kategori Tidak Tersedia";
    }
    
    public String getJudul(){
        return Judul;
    }
    public void setJudul(String Judul){
        this.Judul = Judul;
    }
    public String getPenulis(){
       return Penulis;
    }
    public void setPenulis(String Penulis){
        this.Penulis = Penulis;
    }
    public String getPublisher(){
        return Publisher;
    }
    public void setPublisher(String Publisher){
        this.Publisher=Publisher;
    } 
    public String getKategori(){
       return Kategori;
}

}

