package pl.javastart.task;

public enum Season {
    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private String polishName;
    private String[] months;

    Season(String polishName, String[] months) {
        this.polishName = polishName;
        this.months = months;
    }

    public String getPolishName() {
        return polishName;
    }

    public String[] getMonths() {
        return months;
    }
}