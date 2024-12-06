package com.example.geradorpalavras;

public class Frase {
    String texto;
    String autor;

    public Frase(String texto, String autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public String toString() {
        return texto + " - " + autor;
    }
}
