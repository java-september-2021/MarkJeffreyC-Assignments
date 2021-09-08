import java.util.HashMap;

public class MapOfHash{
    public HashMap<String, String> trackList = new HashMap<String, String>();

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