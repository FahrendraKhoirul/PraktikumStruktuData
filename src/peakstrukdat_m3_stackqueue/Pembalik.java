
package peakstrukdat_m3_stackqueue;

public class Pembalik {
    
    private String kata;
    private Stack stack;
    private String kataKebalik = "";
    
    public Pembalik(String input){
        kata = input;
        stack = new Stack(kata.length());
    }
    
    public String Hasil(){
        for(int i = 0; i<kata.length(); i++){
            stack.push(Character.toString(kata.charAt(i)));
        }
        
        for(int i=0; i<kata.length(); i++){
            kataKebalik += stack.pop();
        }
        
        return kataKebalik;
    }
    
   
}
