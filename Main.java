public class Main {

    public static void main (String[] args){
    
    movie m1 = new movie();
    m1.title = "Interstellar";
    m1.genre = "Adventure";
    m1.duration = 120;
    
    movie m2 = new movie();
    m2.title = "Spiderman";
    m2.genre = "Adventure";
    m2.duration = 110;
    
    movie m3 = new movie();
    m3.title = "Superman";
    m3.genre = "Sci-Fi";
    m3.duration = 130;
    
    m1.displayInfo();
    m2.displayInfo();
    m3.displayInfo();
    }
}