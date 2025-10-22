package example02sortingObjects;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<SongV3> getSong(){
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhicker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("Cassidy", "grateful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
    
    public static List<SongV3> getSongV3(){
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhicker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("$10", "hitchhicker", 140));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
    
    
    
    
}
