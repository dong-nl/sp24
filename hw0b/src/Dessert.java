public class Dessert {
    private int flavor;
    private int price;

    private static int numDesserts;

    public Dessert(int flavor,int price){
        this.flavor= flavor;
        this.price =price;

        Dessert.numDesserts++;
    }

    public void printDessert(){
        System.out.println(flavor + " " + price + " " + Dessert.numDesserts);
    }

    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
