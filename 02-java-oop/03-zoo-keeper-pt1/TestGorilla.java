public class TestGorilla {
    public static void main(String[] args){
        Gorilla ape = new Gorilla();
        Gorilla monkey = new Gorilla();

        ape.throwSomething();
        monkey.climb();
        monkey.eatBananas();

        ape.displayEnergy();
        monkey.displayEnergy();
    }
}
