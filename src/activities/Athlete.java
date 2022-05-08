package activities;

public class Athlete {
        int Initial_Calories_Burnt = 0 ;
        float Initial_Heart_Rate = 80;
        float Heart_Rate_Increase;
       
  Stats Swimming = new Stats();
  Stats Running = new Stats();
  Stats Kick_Boxing = new Stats();
  Stats Strength_Training = new Stats();
  
  public void set(){
      Swimming.setCalories(4);
      Swimming.setHeart_Rate((float) (0.2/100));
      
      Running.setCalories(5);
      Running.setHeart_Rate((float) (0.3/100));
      
      Kick_Boxing.setCalories(3);
      Kick_Boxing.setHeart_Rate((float) (0.5/100));
      
      Strength_Training.setCalories(5);
      Strength_Training.setHeart_Rate((float) (0.6/100));
  }
  public int Total_Calories_Burnt(String Sport1 , int Time){
     if (   null != Sport1)switch (Sport1) {
                case "Swimming": 
                    Initial_Calories_Burnt = Initial_Calories_Burnt + Swimming.getCalories()*Time;
                    break;
                case "Running":
                    Initial_Calories_Burnt = Initial_Calories_Burnt + Running.getCalories()*Time;
                    break;
                case "Kick_Boxing":
                    Initial_Calories_Burnt = Initial_Calories_Burnt + Kick_Boxing.getCalories()*Time;
                    break;
                case "Strength_Training":
                    Initial_Calories_Burnt = Initial_Calories_Burnt + Strength_Training.getCalories()*Time;
                    break;
                default:
                    break;
            }
            return Initial_Calories_Burnt;
  }
  
  public float CalcFinal_Heart_Rate (String Sport2, int time){
      if(   null != Sport2)switch (Sport2) {
                case "Swimming":
                     Heart_Rate_Increase =Fitness_Tracker1.Swimming_Heart + Swimming.getHeart_Rate() * time * Initial_Heart_Rate;
                    setInitial_Heart_Rate(Initial_Heart_Rate + (Swimming.getHeart_Rate() * time * Initial_Heart_Rate));
                    break;
                case "Running":
                    Heart_Rate_Increase =Fitness_Tracker1.Running_Heart + Running.getHeart_Rate() * time * Initial_Heart_Rate;
                    setInitial_Heart_Rate(Initial_Heart_Rate + (Running.getHeart_Rate() * time * Initial_Heart_Rate));
                    break;
                case "Kick_Boxing":
                    Heart_Rate_Increase =Fitness_Tracker1.Boxing_Heart + Kick_Boxing.getHeart_Rate() * time * Initial_Heart_Rate;
                    setInitial_Heart_Rate(Initial_Heart_Rate + (Kick_Boxing.getHeart_Rate() * time * Initial_Heart_Rate));
                    break;
                case "Strength_Training":
                    Heart_Rate_Increase =Fitness_Tracker1.Strength_Heart + Strength_Training.getHeart_Rate() * time * Initial_Heart_Rate;
                    setInitial_Heart_Rate(Initial_Heart_Rate + (Strength_Training.getHeart_Rate() * time * Initial_Heart_Rate));
                    break;
                default:
                    break;
            }
            return Initial_Heart_Rate;
  }

    public int getInitial_Calories_Burnt() {
        return Initial_Calories_Burnt;
    }

    public void setInitial_Calories_Burnt(int Initial_Calories_Burnt) {
        this.Initial_Calories_Burnt = Initial_Calories_Burnt;
    }

    public float getInitial_Heart_Rate() {
        return Initial_Heart_Rate;
    }

    public void setInitial_Heart_Rate(float Initial_Heart_Rate) {
        this.Initial_Heart_Rate = Initial_Heart_Rate;
    }

}
