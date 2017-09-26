package patterns2;

import patterns.Obj;


public class Binary {
    
    Binary(int i) { System.out.println(Integer.toBinaryString(i));}
    Binary(String ii) { byte bb[]={65,66,67,68}; 
                        for(int i=0;i<bb.length;i++){ 
                            int dec = Integer.parseInt(Byte.toString(bb[i])); 
                            String by = Integer.toBinaryString(dec); 
                            System.out.print(by + " "); 
                        }
                        System.out.println("");
    }
    
    public static void main(String[] args) {
        Binary O = new Binary("4");
        
    }
    
    
}
