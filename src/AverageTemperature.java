public class AverageTemperature {
    public static void main(String[] args){
        //Declare and assign random temperatures to array of temperatures
        int[] temperatures = new int[14];
        for (int i=0; i<temperatures.length;i++){
            temperatures[i]=(int)(Math.random()*201-100);
        }
        
        //Find average temperature and print
        System.out.println("The average temperature is: " + 
                calcAvg(temperatures));
        
        //Edit on remote repo
        
        //Find max temperature
        System.out.println("The max temperature is: " + calcMax(temperatures));
    }
    
    //Create method to exclude temperatures outside -50 to 50 and find average
    public static double calcAvg(int[] temperatures){
        int totalTemperatures=0;
        int numberOfTemperatures=0;
        for(int i=0; i<temperatures.length;i++){
            if(temperatures[i]>50 || temperatures[i]<-50){
            }else{
                totalTemperatures += temperatures[i];
                numberOfTemperatures++;
            }
        }
        return totalTemperatures/numberOfTemperatures;
    }
    
    public static int calcMax(int[] temperatures){
        int maxTemperature=-200;
        for(int i=0; i<temperatures.length;i++){
            if(temperatures[i]>50 || temperatures[i]<-50){
            }else{
                if(temperatures[i]>maxTemperature)
                maxTemperature = temperatures[i];
            }
        }
        return maxTemperature;
    }
}
