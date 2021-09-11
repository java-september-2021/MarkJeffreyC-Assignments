public abstract class Phone {
    protected String versionNumber;
    protected int batteryPercentage;
    protected String carrier;
    protected String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself

    public void setVersionNumber(String versionNumber){
        this.versionNumber = versionNumber;
    }

    public void setBatteryPercentage(int batteryPercentage){
        this.batteryPercentage = batteryPercentage;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void setRingTone(String ringTone){
        this.ringTone = ringTone;
    }

    public String getVersionNumber(){
        return versionNumber;
    }

    public int getBatteryPercentage(){
        return batteryPercentage;
    }

    public String getCarrier(){
        return carrier;
    }

    public String getRingTone(){
        return ringTone;
    }

    public String ring(){
        return "Phone is ringing";
    }

    public String unlock(){
        return "Phone is unlocked";
    }
}