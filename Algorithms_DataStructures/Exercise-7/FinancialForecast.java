public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000.0;
        double growthRate = 0.10;   // 10%
        int years = 5;

        double futureValue = forecast(currentValue, growthRate, years);

        System.out.println("========== Financial Forecast ==========");
        System.out.println("Current Value : " + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.println("Future Value  : " + futureValue);

        /*
        

        ANALYSIS

        Recursion
        ---------
        Recursion is a technique where a method
        calls itself until a base condition is reached.

        Time Complexity
        ----------------
        Recursive Algorithm : O(n)

        Space Complexity
        -----------------
        O(n)
        because each recursive call is stored
        in the call stack.

        Optimization
        ------------
        The recursive solution can be optimized by:
        1. Memoization
        2. Dynamic Programming
        3. Using an iterative loop (O(1) extra space)

       
        */
    }
}