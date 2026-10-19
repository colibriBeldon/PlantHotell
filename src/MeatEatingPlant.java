public class MeatEatingPlant extends Plant{ // arv från Plant

    //Constructor
    public MeatEatingPlant(String name, double height, WaterType waterType) {
        super(name, height, waterType);
    }
    //Abstracts
    @Override
    public double waterAmount() {// 0,5L per day * length
        return 0.1 + ( this.getHeight() * 0.2);
    }
    // Polymorphism
    @Override
    public String waterInstructions(){ // Lägger till Köttätande växten och kallar sedan på Plant.waterInstructions
        return "Köttätande växten " + super.waterInstructions();
    }


}
