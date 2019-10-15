package animals;

public class Animals {
    
private String name;
private float weigth;
private int age;
private int heigth;
private String complaint;
private String diagnos;

public Animals(String name, float weigth,int age,int heigth, String complaint, String diagnos){

        this.name = name;
        this.weigth = weigth;
        this.age = age;
        this.heigth = heigth;
        this.complaint = complaint;
        this.diagnos = diagnos;
}

public float getWeigth(){
       return weigth;
}
public int getAge(){
       return age;
}
public String getComplaint(){
       return complaint;
}
public String getDiagnos(){
       return diagnos;
}
public int getHeigth(){
       return heigth;
}

public void setName(String name){
    this.name = name;
}
public void setWeigth(float weigth){
    this.weigth = weigth;
}
public void setAge(int age){
    this.age = age;
}
public void setHeigth(int heigth){
    this.heigth = heigth;
}
public void setComplaint(String complaint){
    this.complaint = complaint;
}
public void setDiagnos(String diagnos){
    this.diagnos = diagnos;
}
    
}
