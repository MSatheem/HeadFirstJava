/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example02sortingObjects;

import java.util.List;

/**
 *
 * @author sathe
 */
public class JukeBox5 {
    public static void main(String[] args) {
        new JukeBox5().go();
    }
    
    public void go() {
        List<SongV3> songList = MockSongs.getSong();
        System.out.println(songList);
        
        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);
        
        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}
