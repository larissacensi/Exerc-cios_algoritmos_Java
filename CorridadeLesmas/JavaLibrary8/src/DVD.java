/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larissa.pelenci
 */
public class DVD extends Item{
    private String director;
    
    public DVD(String title, String director, int playingTime){
        super(title, playingTime);
        this.director = director;
    }
    
    public void print() {
        System.out.print("DVD: " + getTitle() + " (" + getPlayingTime() + " mins)");
        
        if (owned) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("     " + getComment());
    }
    
    
    
}
