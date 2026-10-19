public class Cactus extends Plant{ // arv från Plant

    //Constructor
    public Cactus(String name, double height, WaterType waterType) {
        super(name, height, waterType);
    }
    //Abstracts
    @Override
    public double waterAmount() {// 2cl
        return 0.02;
    }
    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Kaktusen och kallar sedan på Plant.waterInstructions
        return "Kaktusen " + super.waterInstructions();
    }


}