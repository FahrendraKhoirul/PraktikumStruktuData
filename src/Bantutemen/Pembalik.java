
package Bantutemen;


public class Pembalik {
    
    private String kata;
    private String kataKebalik = "";
    
    public Pembalik(String input){
        kata = input;
    }

    public String getKataKebalik() {
        return kataKebalik;
    }
    
   
    public String balik(){ 
        //int stackSize = kata.length(); 
        LinkStack stack = new LinkStack(); 
        
        for(int j=0; j<kata.length(); j++){
            String ch = Character.toString(kata.charAt(j)); 
            stack.push(ch); 
        }
        while( !stack.isEmpty() ){
            String ch = stack.pop();
            kataKebalik += ch; 
        }
        return getKataKebalik();
    } 
   
}



    