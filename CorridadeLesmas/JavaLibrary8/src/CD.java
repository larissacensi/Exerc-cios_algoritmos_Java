/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larissa.pelenci
 */
public class CD extends Item{
    private String artist;
    private int numberOfTracks;
    
    public CD(String title, String artist, int numberOfTracks, int playingTime ){
        super(title, playingTime);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    
    

}

