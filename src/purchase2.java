public class purchase2 {
    public static void main(String[] args) {
        purchase1 oneSale = new purchase1();//make object of purchase1.
        oneSale.readInput(); // to read what user input
        oneSale.writeOutput();
        System.out.println("Cost each $" + oneSale.getUnitCost());
        System.out.println("Total cost $" + oneSale.getTotalCost());
    }
}
