public class Mammal {
    private int energyLevel;

    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public Mammal(){
        this.energyLevel = 100;
    }

    public void displayEnergy(){
        System.out.printf("The Current Mammal's energy level: %d\n", this.energyLevel);
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
}
