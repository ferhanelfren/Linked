/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked;

import sun.awt.image.ImageWatched.Link;

/**
 *
 * @author DS-MAO
 */
public class Link1 {
    
    Link1 Firstlink;
    Link1 Nextlink;
    
    
    String Name;
    int Age;
    int Power;
    String Color;
    
    

    public Link1() {
    }
    
     public Link1( String Name, int Age, int Power, String Color) {
        this.Name = Name;
        this.Age = Age;
        this.Power = Power;
        this.Color = Color;
    }
    
    void  Display_data(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
        System.out.println("Power:"+Power);
        System.out.println("Color:"+Color);
    
    }
    
    
    
    
    
    
}
