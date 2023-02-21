 class Meghana{
    public String getMePen(int cost){
    if(cost>2){
            return  "got a pen";
        }
        else{
           return  "No pen";
        }
   }
   public void music(){
        System.out.println("Meghana listening music");
    }
    public void breakfast(){
        System.out.println("Ate paratha");

    }
    
}
public class Method1{
    public static void main(String args[]){
        Meghana meg=new Meghana();
       String str= meg.getMePen(5);
       System.out.println(str);
        meg.music();
        meg.breakfast();

    }
}
