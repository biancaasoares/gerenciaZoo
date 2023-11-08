package br.senai.jandira.sp.model;

import java.util.Scanner;


public class Menu {

    Scanner scanner = new Scanner(System.in);

    Aves refAve = new Aves();
    Mamiferos refMamifero = new Mamiferos();
    Felinos refFelino = new Felinos();

    Alojamento alojamento = new Alojamento();

    public void exucucaoMenu() {

        boolean continuar = true;
        while (continuar) {

            System.out.println(" -------------- menu ---------------- ");
            System.out.println(" 1 - Cadastro do  animal              ");
            System.out.println(" 2 - Listas de Animais                ");
            System.out.println(" 3 - Consultar animais                ");
            System.out.println(" 4 - Cadastro de Saúde                ");
            System.out.println(" 5 - Sair                             ");
            System.out.println(" ------------------------------------ ");

            int opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Qual das espécies deseja cadastrar?");
                    System.out.println(" 1- Aves");
                    System.out.println(" 2- Felinos");
                    System.out.println(" 3- Mamiferos");

                    int opcaoCadastro = scanner.nextInt();
                    scanner.nextInt();

                    switch (opcaoCadastro) {
                        case 1:
                            Aves ave = new Aves();
                            ave.cadastroAnimal();
                            refAve.adicionarAves(ave);
                            alojamento.addAveAloj(ave);
                            break;

                        case 2:
                            Felinos felino = new Felinos();
                            felino.cadastroAnimal();
                            refFelino.adicionarFelinos(felino);
                            alojamento.addFelinoAloj(felino);
                            break;
                        case 3:
                            Mamiferos mamifero = new Mamiferos();
                            mamifero.cadastroAnimal();
                            refMamifero.adicionarMamiferos(mamifero);
                            alojamento.addMamiferoAloj(mamifero);
                            break;


                    }
                default:
                    System.out.println("erro");
            }
        }
    }
}