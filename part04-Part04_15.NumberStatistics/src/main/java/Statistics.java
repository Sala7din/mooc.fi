
public class Statistics {
    private int count;
    private int sum;
   
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
        
    }
    
    public void addNumber(int number) {
        count = count + 1;
        sum = sum + number;
        
        
    }
    
    public int getCount() {
        
        return count;
    }
    
    public int sum() {
        if (sum > 0){
            return sum;
        }else{
       return 0;
       } 
    }
    
    public double average() {
        if (sum > 0){
            return (sum * 1.0 / count);
        }else{
        return 0;
        }
    }
}
