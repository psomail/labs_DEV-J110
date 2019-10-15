package clinika;

import animals.*;
import diagnos.*;

public class Clinica {
    
    public static void main(String [] strings){
        
        Doctor  doctorTerapevt = new Doctor("Иванов", "Терапевт" );
        Doctor DoctorDiagn = new Doctor("Иванова","Диагност"); 
        
        Beaver  beaver = new Beaver("Чуча",3.0f,2,3,"Температура", "неопределен");
        Cat cat = new Cat("Рыжик",1.4f,1,2,"Беспокойство", "неопределен");
        
        doctorTerapevt.diagnostic(cat);
        doctorTerapevt.diagnostic(beaver);
        System.out.println("test");
        
    }
    
}
