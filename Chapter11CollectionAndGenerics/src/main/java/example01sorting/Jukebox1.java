/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example01sorting;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author sathe
 */
public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }
    
    
    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
