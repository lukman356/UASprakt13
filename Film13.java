package UASPrakt13;

public class Film13 {
    private String kodeFilm;
    private String judul;
    private String genre;
    private double rating;

    // Constructor with parameters
    public Film13(String kodeFilm, String judul, String genre, double rating) {
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.genre = genre;
        this.rating = rating;
    }

    // Getter methods
    public String getKodeFilm() {
        return kodeFilm;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    // Setter methods
    public void setKodeFilm(String kodeFilm) {
        this.kodeFilm = kodeFilm;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to display film information
    public void tampilInformasi() {
        System.out.println("Kode Film: " + kodeFilm);
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    @Override
    public String toString() {
        return "Film{" +
                "kodeFilm='" + kodeFilm + '\'' +
                ", judul='" + judul + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
