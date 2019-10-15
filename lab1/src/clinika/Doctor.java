package clinika;

import animals.*;
import diagnos.*;


public class Doctor extends Staff{
    
       
    public Doctor(String name, String position){
        this.name = name;
        this.position = position;
    }
    
    public Animals diagnostic(Animals animal){
        
        if(animal.getComplaint().equals("Температура")) animal.setDiagnos("Инфекция");
        if(animal.getComplaint().equals("Беспокойство")) animal.setDiagnos("Глисты");
        
        return animal;
    }
}
