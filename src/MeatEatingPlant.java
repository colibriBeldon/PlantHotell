public class MeatEatingPlant extends Plant{ // arv från Plant
    static final double BASE_VOLUME = 0.1;
    static final double MULTIPLIER = 0.2;

    //Constructor
    public MeatEatingPlant(String name, double height, WaterType waterType) {
        super(name, height, waterType);
    }
    //Abstracts
    @Override
    public double waterAmount() {// 0,5L per day * length
        return BASE_VOLUME + ( this.getHeight() * MULTIPLIER);
    }
    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Köttätande växten och kallar sedan på Plant.waterInstructions
        return "Köttätande växten " + super.waterInstructions();
    }


}
