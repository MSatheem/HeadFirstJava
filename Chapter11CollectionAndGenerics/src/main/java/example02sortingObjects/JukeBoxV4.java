package example02sortingObjects;

import java.util.Collections;
import java.util.List;

public class JukeBoxV4 {

    public static void main(String[] args) {
        new JukeBoxV4().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs.getSongV3();
        System.out.println(songList);

        //collection uses the sorter in songV3 compareTo method determines the order
        // i.e the title
        Collections.sort(songList);
        System.out.println(songList);
        
        //artist comapre method would use the ArtisCompare classes compare method
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}
