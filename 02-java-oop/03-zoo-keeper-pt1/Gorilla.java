import javax.sound.midi.SysexMessage;

public class Gorilla extends Mammal {
    int myEnergy;
    //throwSomething()
    public void throwSomething(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy - 5;
        setEnergyLevel(this.myEnergy);

        System.out.printf("Ape throws a rock!! (%d)\n", getEnergyLevel());
    }

    //eatBananas()
    public void eatBananas(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy + 10;
        setEnergyLevel(this.myEnergy);

        System.out.printf("Ape ate one banana!! (%d)\n", getEnergyLevel());
    }

    //climb()
    public void climb(){
        this.myEnergy = getEnergyLevel();
        this.myEnergy = this.myEnergy - 10;
        setEnergyLevel(this.myEnergy);

        System.out.printf("Ape climbs a tree!! (%d)\n", getEnergyLevel());
    }
}
