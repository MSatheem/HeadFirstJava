/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example02sortingObjects;

/**
 *
 * @author sathe
 */
public class SongV4 implements Comparable<SongV4>{
    private String title;
    private String artsit;
    private int bpm;

    public SongV4(String title, String artsit, int bpm) {
        this.title = title;
        this.artsit = artsit;
        this.bpm = bpm;
    }

    @Override
    public boolean equals(Object aSong) {
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }
    
    @Override
    public int hashCode() {
        return title.hashCode();
    }
    
    @Override
    public int compareTo(SongV4 s) {
        return title.compareTo(s.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtsit() {
        return artsit;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }
    
    
}
