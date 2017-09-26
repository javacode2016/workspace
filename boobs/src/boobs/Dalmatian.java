package boobs;


class Dalmatian extends Dog{
    Dalmatian () {
super();
}
Dalmatian (String n, int a) {
super(n, a);
}

   @Override
   public void voice() {
        for (int i = 1; i <= 2; i++) {
        System.out.println(this.name+": ГАВ-ГАВ");
            System.out.println('l');
        }
    }
    public int[] voice(int[] a) {
    
        for(int i=0; i>=a.length;i++) {
            a[i] = i;
        }
        
    return a;
    
    }
    
}
