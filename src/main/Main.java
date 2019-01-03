package main;

import model.Movie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.title = "Coco";
        movie.duration = 120;


        int exit = 0;
        do {
            System.out.println("Bienvenidos a amazon view \n");
            System.out.println("Selecciona el numero de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    exit = 0;
                    break;
                case 1:
                    //showMovies();
                    break;
                case 2:
                    //showMovies();
                    break;
                case 3:
                    //showMovies();
                    break;
                case 4:
                    //showMovies();
                    break;
                default:
                    System.out.println("\nIngresa un valor valido\n");
                    exit = 1;
                    break;
            }

        } while ( exit != 0);
    }

}
