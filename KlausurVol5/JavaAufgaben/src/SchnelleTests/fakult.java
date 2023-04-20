package SchnelleTests;

public class fakult {
    public int fak(int n){
        if( n > 1){
            return n * fak(n-1);
        }else{
            return n;
        }
    }
}
