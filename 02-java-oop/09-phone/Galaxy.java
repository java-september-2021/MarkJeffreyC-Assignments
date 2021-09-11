public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        return String.format("Galaxy (%s) is ringing %s", this.versionNumber, this.ringTone);
    }
    @Override
    public String unlock() {
        // your code here
        return String.format("Galaxy (%s) is unlocked", this.versionNumber);
    }

    public void displayInfo() {
        // your code here
        System.out.printf("Galaxy\n");
        System.out.printf("Version Number: %s\n", this.versionNumber);
        System.out.printf("Battery Percentage: %d\n", this.batteryPercentage);
        System.out.printf("Carrier: %s\n", this.carrier);
        System.out.printf("Current Ringtone: %s\n", this.ringTone);
    }
}