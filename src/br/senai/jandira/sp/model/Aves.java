package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;


public class Aves extends Animais {

    List<Aves> listAve = new ArrayList<>();

    public Aves(String especies) {
        super(especies);
    }



    public void listaDeAves(){
        for (Aves ave : listAve){
            System.out.println("------ Lista de Aves ------");
            System.out.println("id: " + ave.idUnica);
            System.out.println("nome " + ave.nome);
            System.out.println("idade " + ave.idade);
            System.out.println("----------------------------");
        }
    }

    public Aves(){
        super ("aves");
    }

    public void adicionarAves(Aves ave){
        listAve.add(ave);
    }
}

