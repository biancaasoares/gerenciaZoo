package br.senai.jandira.sp.model;

import java.util.Scanner;


public class Animais {


    String nome, especies,sexo;
    int idade, idUnica;

    Scanner scanner = new Scanner(System.in);

    public Animais (String especies){
        this.especies = especies;
    }

    public Animais() {

    }

    public void cadastroAnimal(){
        System.out.println(" --------- Cadastre o Animal ---------- ");
        System.out.println("Digite o nome do animal: ");
        nome = scanner.nextLine();
        System.out.println("Digite a identificação única do animal: ");
        idUnica = scanner.nextInt();
        System.out.println("Digite a idade do animal: ");
        idade = scanner.nextInt();
        System.out.println("Digite o sexo do animal: ");
        sexo = scanner.nextLine();
        System.out.println("-------------------------------------------");

    }


}


