enum WaterType {
    TAP_WATER("Kranvatten"),
    PROTEIN_WATER("Proteinvatten"),
    MINERAL_WATER("Mineralvatten");

    private final String description;
    // Constructor
    WaterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
