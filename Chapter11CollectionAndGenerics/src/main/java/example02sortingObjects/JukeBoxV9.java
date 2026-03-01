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
public class JukeBoxV9 {
    public static void main(String[] args) {
        new JukeBoxV9().go();
    }
    
    public void go() {
        //list conatains song
        List<SongV4> songList = MockSongs.getSongV4();
        //printing the list
        System.out.println(songList);
        
        //sorting the arraylist using lambda expressions according to their title
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        
        //printing the sorted list
        System.out.println(songList);
        
        //set to hold songV4 objects
        Set<SongV4> songSet = new HashSet<SongV4>(songList);
        System.out.println(songSet); //still duplicates exists
    }
}
