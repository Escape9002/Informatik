import java.util.LinkedList;

/*
 * the stuff written here is neither what is likely to be asked in the class test, nor has correct information on what a 2d Array is (or what an hash is, this here is utter bullshit). 
 * other than that, the hashedArray would outperform the intArray when storing + searching for Strings
 */


public class Arrays {
     //  Eindimensional Array + suche nach einer Zahl

     int[] values = new int[100];
     int pointerInt = 0;
 
     public void arrayInt(int value){
 
         if(pointerInt < (values.length - 1)){
             values[pointerInt] = value;
             pointerInt++;
         }else{
             pointerInt = 0;
             arrayInt(value);
         }
     }
 
     public String findArrayInt(int value){
         for(int i = 0; i < (values.length -1); i++){
             if(values[i] == value){
                 return "found";
             }
         }
         return "nothing found";
        }

    public String benchmarkInt(int value){
        long current = System.nanoTime();

        findArrayInt(value);
        
        return Long.toString((System.nanoTime() - current));
    }

 
 //-------------------------------------------------------------------
 
     // zweidimensionales Array und die Suche nach einer Zahl darin
     // bitte nur Werte bis 300 einfügen
 
     int pointerStr = 0;
     LinkedList<Integer>[] storage = new LinkedList[100];
     public void hashedArray(int value){
 
         int hash = (value / 3);
         if(hash > 100){
             System.out.println("come here you little ****, and read the f manual!");
         }
 
         if(storage[hash] == null){
             storage[hash] = new LinkedList<Integer>();
         }
            
         storage[hash].add(value);
         
     }
 
     public String findHashedArray(int value){
         int hash = value/3;
 
         for(int i = 0; i < (storage[hash].size()); i++){
             if(storage[hash].get(i) == value){
                 return "found";
             }
         }

         return"Nothing found";
     }

     public String benchmarkH(int value){
        long current = System.nanoTime();

        findHashedArray(value);
        
        return Long.toString((System.nanoTime()- current));
     }
}
