/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example02sortingObjects;

import java.util.Comparator;

/**
 *
 * @author sathe
 */
public class ArtistCompare implements Comparator<SongV3>{

    @Override
    public int compare(SongV3 song1, SongV3 song2) {
        return song1.getArtist().compareTo(song2.getArtist());
    }
    
}
