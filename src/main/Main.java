package main;

import model.Movie;

import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Movie movie = new Movie("Coco", "Animation", (short)2017);
    movie.showData();
    // showMenu();
  }
  public static void showMenu() {
    int exit = 0;
    do {
      System.out.println("Bienvenidos a amazon view \n");
      System.out.println("Selecciona el numero de la opción deseada");
      System.out.println("1. Movies");
      System.out.println("2. Series");
      System.out.println("3. Books");
      System.out.println("4. Magazines");
      System.out.println("5. Report");
      System.out.println("6. Report today");
      System.out.println("0. Exit");

      Scanner sc = new Scanner(System.in);
      int response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 0:
          exit = 0;
          break;
        case 1:
          showMovies();
          exit = 1;
          break;
        case 2:
          showSeries();
          break;
        case 3:
          showBooks();
          break;
        case 4:
          showMagazine();
          break;
        case 5:
          makeReport();
          break;
        case 6:
          makeReport(new Date());
          break;
        default:
          System.out.println("\nIngresa un valor valido\n");
          exit = 1;
          break;
      }

    } while ( exit != 0);
  }

  public static void showMovies() {
    int exit = 0;
    do {
      System.out.println("\n::Movies::\n");
    } while (exit != 0);
  }
  public static void showSeries() {
    int exit = 0;
    do {
      System.out.println("\n::Series::\n");
    } while (exit != 0);
  }
  public static void showChapter() {
    int exit = 0;
    do {
      System.out.println("\n::Chapter::\n");
    } while (exit != 0);
  }
  public static void showBooks() {
    int exit = 0;
    do {
      System.out.println("\n::Books::\n");
    } while (exit != 0);
  }
  public static void showMagazine() {
    int exit = 0;
    do {
      System.out.println("\n::Magazine::\n");
    } while (exit != 0);
  }

  public static void makeReport() {

  }

  public static void makeReport(Date date) {

  }

}
