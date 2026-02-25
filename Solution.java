import java.util.Scanner;
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;
    
    public int getResortId(){
        return resortId;
    }
    public void setResortId(int resortId){
        this.resortId = resortId;
    }
     public String getResortName(){
        return resortName;
    }
    public void setResortName(String resortName){
        this.resortName = resortName;
    }
     public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    
    public Resort(int resortId,String resortName,String category,double price,double rating ){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Resort[] resort = new Resort[4];
        for(int i=0;i<resort.length;i++){
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            double rating = sc.nextDouble();
            sc.nextLine();
            resort[i] = new Resort(resortId, resortName, category, price, rating);
        }
        String selCategory = sc.nextLine();
        
       double AvgAmount = findAvgPriceByCategory(resort, selCategory);
        if(AvgAmount>0){
            System.out.print("Average price of the"+selCategory+"Resort:"+AvgAmount);
        }
        else{
            System.out.print("There are no such avalaible resort.");
        }
    }
        public  static double findAvgPriceByCategory(Resort[] resort,String category){
            double AvgPrice = 0;
            double AvgAmount = 0;
            int count =0;
            for(int i=0;i<resort.length;i++){
                if(resort[i].getCategory().equalsIgnoreCase(category) && resort[i].getRating() > 4){
                    AvgPrice += resort[i].getPrice();
                    count++;
                }
            }
            if(count>0){
                AvgAmount = AvgPrice/count;
            }
           return AvgAmount;
        }
}