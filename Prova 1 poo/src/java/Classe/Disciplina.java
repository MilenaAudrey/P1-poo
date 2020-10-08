/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;
import java.util.ArrayList;
/**
 *
 * @author milen
 */
public class Disciplina {
    private String nome;
    private String ementa;
    private int ciclo;
    private Double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    private static ArrayList<Disciplina> disciplina2;
    public Disciplina(String nome, String ementa, int ciclo){
        this.nome=nome;
        this.ementa=ementa;
        this.ciclo=ciclo;
    }
    public static ArrayList<Disciplina> getDisciplina(){
        if(disciplina2 ==null){
            disciplina2.add(new Disciplina ("Banco de Dados", "ementa", 4));
            disciplina2.add(new Disciplina ("Engenharia de Software III", "ementa", 4));
            disciplina2.add(new Disciplina ("Programação Orientada a Objetos", "ementa", 4));
            disciplina2.add(new Disciplina ("Limguagem de Programação IV ", "ementa", 4));
            disciplina2.add(new Disciplina ("Inglês", "ementa", 4));
            disciplina2.add(new Disciplina ("Sistemas Operacionais II", "ementa", 4));
            disciplina2.add(new Disciplina ("Metodologia  da Pesquisa Científica - Tecnológica", "ementa", 4));
        }
        return disciplina2;
    }
    public ArrayList<Disciplina> getDisciplina3(){
        return disciplina2;
    }
}


