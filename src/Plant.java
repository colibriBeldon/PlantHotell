 abstract class Plant implements Waterable { /** Abstract för att det bara är en bas och ska inte fungera utan subklasser*/
    // Private (inkapsling)
    private String name;
    private double height;
    private WaterType waterType; // ENUM

    // Constructor
    public Plant(String name, double height, WaterType waterType) {
        this.name = name;
        this.height = height;
        this.waterType = waterType;
    }

    //Waterable Interface
    public String waterInstructions(){
        return  this.name + " behöver " + waterType.getDescription() + ".\n" +
                "Den behöver "+ Double.toString(this.waterAmount()) +
                "L vatten om dagen." ;
    }

    // Getters (Inkapsling)
    public WaterType getWaterType() {
        return waterType;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {return height; }
}
