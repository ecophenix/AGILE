package CarSimulation.CarSimulation;


import java.util.ArrayList;
import java.util.List;

import CustomException.NoCarsLeftException;

/**
 * Décrivez votre classe GazStation ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GazStation
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int gazLeft;
    private List<Car> les_voitures;

    /**
     * Constructeur d'objets de classe GazStation
     */
    public GazStation(List<Car> voitures,int gaz)
    {
        // initialisation des variables d'instance
        this.les_voitures = voitures;
        this.gazLeft = gaz;
    }
    
    public GazStation(int gaz)
    {
        // initialisation des variables d'instance
        this.les_voitures = new ArrayList<Car>();
        this.gazLeft = gaz;
    }
    

    public boolean fillTheCar(Car c, int liters)
    {
        int actualCapacityOfTheCar = c.getCapacite();
        if(this.gazLeft >= liters){
            c.setCapacite(actualCapacityOfTheCar+liters);
            this.gazLeft -= liters;
            return true; 
    }
    else return false; 
   
}
 public int getGazLeft()
    {
       return this.gazLeft;
   
}
 public int setGazLeft(int a)
    {
       return this.gazLeft = a;
   
}
 
 public void addCar(Car newCar) {
	 this.les_voitures.add(newCar);
 }
 
 public void removeCar(Car c) throws NoCarsLeftException {
	 if(les_voitures.contains(c))this.les_voitures.remove(c);
	 else throw new NoCarsLeftException("can't delete a car that doesn't exist");
	 
 }
 
 public void removeAllCar() {
	 this.les_voitures.clear();
 }
 
 public List<Car> getCars() {
	 return this.les_voitures;
 }
 
 public int fillAllTheCars(int litres)
 {
	int sum =0;
  for(Car  c : les_voitures) {
	 if(fillTheCar(c,litres)) {
		 sum++;
	 }
	 else break;
  }	
  	return sum;
}
 
}

