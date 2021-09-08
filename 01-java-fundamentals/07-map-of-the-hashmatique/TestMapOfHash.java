public class TestMapOfHash{
    public static void main(String[] args){
        MapOfHash songs = new MapOfHash();

        songs.addSong("Billy Jean", "Billy Jean is not my lover, She's just a girl who claims that I am the one");
        songs.addSong("Pretty Little Thing", "It's alright, it's alright, Tell me you need me");
        songs.addSong("Bad", "Because I'm Bad, I'm Bad, You know I'm Bad, I'm Bad");

        System.out.println(songs.getLyric("Billy Jean"));
        System.out.println(songs.getLyric("Pretty Little Thing"));
        System.out.println(songs.getLyric("Bad"));

        songs.displayList();
    }
}