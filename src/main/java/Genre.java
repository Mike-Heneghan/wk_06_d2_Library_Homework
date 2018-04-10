public enum Genre {
    THRILLER("Exciting books where the reader struggles to stop reading as the story twists and turns."),
    TRUE_CRIME("Documented cases of horrible goings on for people with a distorted sense of fun."),
    SCI_FI("Science fact and theory are blended with fantastical elements to make stories based around technologies and possibilities");

    private final String description;

    Genre(String description){
        this.description = description;
    }
}
