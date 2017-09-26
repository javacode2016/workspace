package habibulin;


import java.lang.annotation.*;
import java.lang.reflect.*;

public class MyClass {
    
    public int pubInt;
    private int privInt;
    public Integer pubI = new Integer(5);
    private Integer privI = new Integer(6);
    public String pubStr;
    private String privStr;
    @Deprecated
    public void pubVoid() {}
    @Deprecated
    private void privVoid() {}
    
    public int pubInt(String pubStr) {return pubInt;}
    private int privInt(int pubInt) {return privInt;}
    
    
    public void SearchAnnotation(String classAdr, String sAnnotation) {
        try{
            Class c3 = Class.forName(classAdr);// создаем 3-й экземпляр объекта Class, вызывает исключения
            Method[] methods = c3.getDeclaredMethods();
            for (Method m : methods) {
                Annotation[] annotations = m.getAnnotations(); 
                System.out.println(annotations.length);
                for (Annotation a : annotations){
                    if(a.toString().indexOf(sAnnotation) != -1){
                        
                        System.out.println(sAnnotation + " is found in - "+ m);}
                    else {
                        System.out.println(sAnnotation + " no found");}
                }
                //System.out.println(m);
            }
        }
        catch(Exception e){ System.out.println("Сработало исключение" + e);}

    }
    
    
}
