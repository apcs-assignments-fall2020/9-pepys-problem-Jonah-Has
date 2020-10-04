public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static int rollDie(){
        int x = (int)(Math.random() * 6) + 1;
        return x;
    }
    public static double prob(int x, int y){
        int sum = 0;
        for (int i = 0; i < 10000; i++){
            int num = 0;
            for (int j = 0; j < y; j++){
                if(rollDie() == 6){
                    num ++;
                }
            }
            if (num >= x){
                sum ++;
            }
        }
        return (sum / 100);
    }
    public static double probabilityOneSix(){
        return(prob(1, 6));
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        return(prob(2, 12));
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        // REPLACE WITH YOUR CODE HERE
        return(prob(3, 18));
    }


    public static void main(String[] args) {
        System.out.println("The probability of rolling at least one 6 with 6 dice is " + probabilityOneSix() + "%.");
        System.out.println("The probability of rolling at least two 6s with 12 dice is " + probabilityTwoSixes() + "%.");
        System.out.println("The probability of rolling at least three 6s with 18 dice is " + probabilityThreeSixes() + "%.");
        
    }
}
