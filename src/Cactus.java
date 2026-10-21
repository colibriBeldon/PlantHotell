public class Cactus extends Plant{ // arv från Plant
    static final double BASE_VOLUME = 0.02;
    //Constructor
    public Cactus(String name, double height, WaterType waterType) {
        super(name, height, waterType);
    }
    //Abstracts
    @Override
    public double waterAmount() {// 2cl
        return BASE_VOLUME;
    }
    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Kaktusen och kallar sedan på Plant.waterInstructions
        return "Kaktusen " + super.waterInstructions();
    }


}