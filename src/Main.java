import java.util.ArrayList;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();

        // Lägg till växter i lista
        String lauraName = "Laura";
        double lauraHeight = 5.0;
        WaterType lauraWaterType = WaterType.TAP_WATER;
        plants.add(new Palm(lauraName, lauraHeight, lauraWaterType));

        String iggeName = "Igge";
        double iggeHeight = 0.2;
        WaterType iggeWaterType = WaterType.MINERAL_WATER;
        plants.add(new Cactus(iggeName, iggeHeight, iggeWaterType));

        String meatLoafName = "Meatloaf";
        double meatHeight = 0.7;
        WaterType meatLoafWaterType = WaterType.PROTEIN_WATER;
        plants.add(new MeatEatingPlant(meatLoafName, meatHeight, meatLoafWaterType));

        String olofName = "Olof";
        double olofHeight = 1;
        WaterType olofWaterType = WaterType.TAP_WATER;
        plants.add(new Palm(olofName, olofHeight, olofWaterType));

        while (true) {
            meny(plants);
        }

    }

    static void meny(ArrayList<Plant> plants) {
        String input = JOptionPane.showInputDialog("Vilken växt ska få vatten?");
        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input får inte vara tom");
            return;
        }
        input = input.trim();
        input = input.toLowerCase();// Jämför båda med toLowerCase()
        for  (Plant plant : plants) {
            if( input.equals(plant.getName().toLowerCase()) ) {
                JOptionPane.showMessageDialog(null,plant.waterInstructions());
                return;
            }
        }
        // om inte match, skriv meddelande
        String message = "Felaktig inmatning matchade inte: " + input +"\n"
            + "Plantor att välja på:";

        for  (Plant plant : plants) {
            message += "\n" + plant.getName();
        }
        JOptionPane.showMessageDialog(null,message);
    }
}