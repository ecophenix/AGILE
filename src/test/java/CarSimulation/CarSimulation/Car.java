package CarSimulation.CarSimulation;

public class Car
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    private int capacite; // combien de litre dans le réservoir
    private int kilometrage ; 
    private int consommation ; 
    
    

    /**
     * Constructeur d'objets de classe Car
     */
    public Car(int capacite , int consommation)
    {
        // initialisation des variables d'instance
        this.capacite = capacite ;
        this.consommation = consommation;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String rouler(int kilometre)
    {
        // Insérez votre code ici
        if ( (capacite / consommation) > kilometre ){
            kilometrage += kilometre ; 
            capacite -= (kilometre*consommation) ; 
            return "votre voiture a avancé de"+ kilometre +"km et il vous reste "+ capacite +"litres";}
        else{
            return "Votre réservoir ne vous permet d'avancer que de"+ capacite/consommation + "km"; }
       
    }
    
     public int getCapacite()
    {
        // Insérez votre code ici
       
        return  this.capacite;
    }
    
     public int getConsommation()
    {
        // Insérez votre code ici
       
        return  this.consommation;
    }
    
     public int getKilometrage()
    {
        // Insérez votre code ici
       
        return  this.kilometrage;
    }
    
     public void setCapacite(int capacite)
    {
        // Insérez votre code ici
       
          this.capacite = capacite ; 
    }
    
     public void setConsommation(int consommation)
    {
        // Insérez votre code ici
       
          this.consommation = consommation ; 
    }
    
     public void setKilometrage(int kilometrage)
    {
        // Insérez votre code ici
       
          this.kilometrage = kilometrage;
    }
}
