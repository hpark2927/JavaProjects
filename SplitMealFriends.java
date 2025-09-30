public class SplitMealFriends {

    
    public static double splitMeal(int numberOfFriends, double totalBill, double tip) {
        double totalWithTip = totalBill + (totalBill * tip);
        double costPerPerson = totalWithTip / numberOfFriends;
        return costPerPerson;
    }

    public static void main(String[] args) {
        
        double individualCost = splitMeal(4, 92.27, 0.20);

        System.out.printf("Each person needs to pay: $%.2f\n", individualCost);
    }
}
