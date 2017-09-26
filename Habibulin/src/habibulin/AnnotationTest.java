package habibulin;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class AnnotationTest {

    
public static void main(String []args) {
        
     MyClass cls = new MyClass() ;
     Class c = cls.getClass() ;
      Method[] methods = c.getMethods();
            for (Method m : methods) {
                Annotation[] annotations = m.getAnnotations(); 
                Annotation[] a = m.getAnnotations() ;
     if(a.length != 0) {
        for(Annotation val : a) {
           System.out.println(val.toString() );
        }
     }
     else {
        System.out.println("Annotations is not present...") ;
     }
            }
     
   }
    
}