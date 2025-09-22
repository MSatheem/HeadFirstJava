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
public class JukeBoxV6 {
    public static void main(String[] args) {
        new JukeBoxV6().go();
    }
    
    public void go() {
        List<SongV3> songList = MockSongs.getSong();
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        
        //artist comaprator
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
        
        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);
        
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);
    }
}
