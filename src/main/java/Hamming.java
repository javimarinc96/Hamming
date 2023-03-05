public class Hamming {

    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if(!rightStrand.isEmpty() && leftStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if(rightStrand.isEmpty() && !leftStrand.isEmpty()){  
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        if(this.leftStrand.length() == 0 && this.rightStrand.length() == 0){
            return 0;
        }
      
        int res = 0;
        for(int i = 0; i<this.leftStrand.length(); i++){
            if(this.leftStrand.charAt(i) != this.rightStrand.charAt(i)){
                res++;
            }
        }
        return res;
    }
    
}
