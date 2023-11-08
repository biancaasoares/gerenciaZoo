package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;

public class Felinos extends Animais  {
    List<Felinos> listFelino= new ArrayList<>();

    public Felinos(String especies) {
        super(especies);
    }

    public void listaDeFelinos(){
        for (Felinos felino : listFelino){
            System.out.println("id: " + felino.idUnica);
            System.out.println("nome " + felino.nome);
            System.out.println("idade " + felino.idade);
            System.out.println("---------------------");
        }
    }

    public Felinos(){
        super ("felino");
    }

    public void adicionarFelinos(Felinos felino){
        listFelino.add(felino);

    }
}




