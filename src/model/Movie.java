package model;

public class Movie {

  public int id;
  public String title;
  public String genre;
  public String creator;
  public int duration;
  public short year;
  public boolean viewed;
  public int timeViewed;

  public Movie(String title, String genre, String creator, int duration, short year) {
    this.title = title;
    this.genre = genre;
    this.creator = creator;
    this.duration = duration;
    this.year = year;
  }

  public Movie(String title, String genre, short year) {
    this.title = title;
    this.genre = genre;
    this.year = year;
  }

  public void showData() {
    System.out.println("Title" + title);
    System.out.println("Genre" + genre);
    System.out.println("Year" + year);
  }

}
