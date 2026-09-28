public class movie {
    String title;
    String genre;
    int duration;

    movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println(title + "\n" + genre + "\n" + duration + "\n");
    }
}