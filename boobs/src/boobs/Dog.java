package boobs;

public class Dog {
    
    public Dog() {
name = "Незнакомец";
}
    public Dog(String n, int a){
        name = n;
        age = a;
    }
  private int age;// возраст
  protected String name; // кличка

    public int getAge() {return age;}
    public String getName() {return name;}

    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}
    

    public void voice() {
        for(int i=1; i<=age;i++){
            System.out.println(name+": гав-гав");
        }
        
        
    }


}
