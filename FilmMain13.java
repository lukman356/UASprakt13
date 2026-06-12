public class FilmMain13 {
    public static void main(String[] args) { //

        BinarySearchTreeFilm13 tree = new BinarySearchTreeFilm13();

        tree.add(new Film13("FL105", "Interstellar", "Sci-Fi", 8.6));
        tree.add(new Film13("FL102", "Coco", "Animation", 8.4));
        tree.add(new Film13("FL108", "Inception", "Sci-Fi", 8.8));
        tree.add(new Film13("FL101", "Up", "Animation", 8.3));
        tree.add(new Film13("FL104", "Parasite", "Thriller", 8.5));
        tree.add(new Film13("FL107", "Spirited Away", "Fantasy", 8.6));

        System.out.println("Data film in-order:");
        tree.traverseInOrder(tree.getRoot());

        System.out.println("\nData film pre-order:");
        tree.traversePreOrder(tree.getRoot());

        if (tree.find("FL104")) {
            System.out.println("\nPencarian FL104: ditemukan");
        } else {
            System.out.println("\nPencarian FL104: tidak ditemukan");
        }

        if (tree.find("FL110")) {
            System.out.println("Pencarian FL110: ditemukan");
        } else {
            System.out.println("Pencarian FL110: tidak ditemukan");
        }

        int totalFilm = tree.hitungJumlahFilm(tree.getRoot());
        System.out.println("\nJumlah film: " + totalFilm);

        System.out.println("\nFilm dengan rating tertinggi:");
        Film13 highestRating = tree.cariRatingTertinggi(tree.getRoot());

        if (highestRating != null) {
            System.out.println("Kode Film : " + highestRating.getKodeFilm());
            System.out.println("Judul     : " + highestRating.getJudul());
            System.out.println("Genre     : " + highestRating.getGenre());
            System.out.println("Rating    : " + highestRating.getRating());
        }
    }
}