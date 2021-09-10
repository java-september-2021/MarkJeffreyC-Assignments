public class Bat extends Mammal {
    private int myEnergy;
    public Bat() {
        setEnergyLevel(300);
    }

    //attackTown()
    public void attackTown(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy - 100;
        setEnergyLevel(this.myEnergy);

        System.out.printf("Town burns on fire!! (%d)\n", getEnergyLevel());
    }

    //eatHumans()
    public void eatHumans(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy + 25;
        setEnergyLevel(this.myEnergy);

        System.out.printf("So- well, never mind!! (%d)\n", getEnergyLevel());
    }

    //fly()
    public void fly(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy - 50;
        setEnergyLevel(this.myEnergy);

        System.out.printf("Bat takes off!! (%d)\n", getEnergyLevel());
    }

}
