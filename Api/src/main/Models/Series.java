public record Series(int seriesId,
    String title,
    String description,
    int releaseYear,
    String creator,
    int seasons,
    String posterURL,
    String trailerURL,
    LocalDate addedDate,
    double rating) {

}
