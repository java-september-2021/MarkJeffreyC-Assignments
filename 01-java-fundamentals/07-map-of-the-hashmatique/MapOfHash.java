import java.util.HashMap;

public class MapOfHash{
    public HashMap<String, String> trackList = new HashMap<String, String>();
    // trackList.put("Billy Jean", "Billy Jean is not my lover, She's just a girl who claims that I am the one");
    // trackList.put("Pretty Little Thing", "It's alright, it's alright, Tell me you need me");
    // trackList.put("Bad", "Because I'm Bad, I'm Bad, You know I'm Bad, I'm Bad");

    public String getLyric(String title){
        return trackList.get(title);
    }

    public void addSong(String title, String lyrics){
        trackList.put(title, lyrics);
    }

    public void displayList(){
        for (String name: trackList.keySet()){
            String key = name;
            System.out.printf("Title: %s\nLyrics: %s\n", key, trackList.get(name));
        }
    }
}