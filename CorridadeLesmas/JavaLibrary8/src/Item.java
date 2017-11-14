/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larissa.pelenci
 */
public class Item {
   private String title; 
   private int playingTime;
   private boolean gotIt;
   private String comment;
   private boolean owned;
   
    public Item(String theTitle, int time){
       title = theTitle;
       playingTime = time;
       gotIt = false;
       comment = ""; 
    }

    public String getTitle() {
        return title;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public boolean isGotIt() {
        return gotIt;
    }
   
    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment(){
     return comment;   
    }
    
    public void setOwn(  ){
        
    }
    
     public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }
    
    public void print() {
        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
        
        if (owned) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("     " + comment);
    }
}
