public record Movie(int movieId,
    String title,
    String description,
    int releaseYear,
    String director,
    int duration,
    String posterURL,
    String trailerURL,
    LocalDate addedDate,
    double rating) {

}
