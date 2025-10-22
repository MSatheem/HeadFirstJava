/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example02sortingObjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sathe
 */
public class JukeBoxV8 {
    public static void main(String[] args) {
        new JukeBoxV8().go();
    }
    
    public void go() {
        //list conatains song
        List<SongV3> songList = MockSongs.getSongV3();
        //printing the list
        System.out.println(songList);
        
        //sorting the arraylist using lambda expressions according to their title
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        //printing the sorted list
        System.out.println(songList);
        
        //set to hold songV3 objects
        Set<SongV3> songSet = new HashSet<SongV3>(songList);
        System.out.println(songSet); //still duplicates exists
    }
}
