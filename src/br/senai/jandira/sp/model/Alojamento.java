package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;


public class Alojamento {

        List<Felinos> alojFelino = new ArrayList<>();

        public void addFelinoAloj (Felinos felino){
            alojFelino.add(felino);
        }

        List<Mamiferos> alojMamifero = new ArrayList<>();

        public void addMamiferoAloj (Mamiferos mamifero){
            alojMamifero.add(mamifero);
        }

        List<Aves> alojAve = new ArrayList<>();

        public void addAveAloj (Aves ave){
            alojAve.add(ave);
        }

    }

