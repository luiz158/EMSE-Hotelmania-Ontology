package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: HotelInformation
* @author ontology bean generator
* @version 2014/05/23, 22:29:18
*/
public class HotelInformation implements Predicate {

   /**
* Protege name: rating
   */
   private float rating;
   public void setRating(float value) { 
    this.rating=value;
   }
   public float getRating() {
     return this.rating;
   }

   /**
* Protege name: hotel
   */
   private Hotel hotel;
   public void setHotel(Hotel value) { 
    this.hotel=value;
   }
   public Hotel getHotel() {
     return this.hotel;
   }

}
