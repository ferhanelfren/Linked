/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked;

//import sun.awt.image.ImageWatched.Link;





/**
 *
 * @author DS-MAO
 */
public class Link2 {
    Link1 Fl=null;

    
    
    public Link2() {
         Link1 Fl=null;

    }
    
    
    
    
   
  //  void Addlink( String Name, int Age, int Power, String Color){
        
     // Link new_link= new Link(Name, Age, Power, Color);
      //new_link.Nextlink=Fl;
    //  Fl=new_link;
        
     
      
  //  }
    
    
    void Addlink( String Name, int Age, int Power, String Color){
        
        Link1 new_link= new Link1(Name, Age, Power, Color);
        new_link.Nextlink=Fl;
        Fl=new_link;
        
    }
    
    void Displaylink(){
         
        Link1 angLinked =Fl;
        
      while (angLinked!=null) {   
            
           angLinked.Display_data();
               
           angLinked=angLinked.Nextlink;
               
               System.out.println("");
        }
        
        
        
        
        
    }
    
    
    
    
}
