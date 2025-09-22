package example02sortingObjects;
import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }
    
    public void go() {
        List<SongV3> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
    }
} 
