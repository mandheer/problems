package in.pabreja.coding.challenge.battery;

import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int maxCurrent = sc.nextInt();
            if(maxCurrent <=0 )
                return;
            worstCaseIteration(maxCurrent-1);
        }
    }

    private static void worstCaseIteration(int maxCurrent){
        // trangular problem
        int initialStepSize = (int) Math.ceil((Math.sqrt(1.0 + 8*maxCurrent) - 1)/2);
//        if(initialStepSize >= maxCurrent){
//            // if step size should always be less than threshold
//            initialStepSize = maxCurrent-1;
//        }
        // the worst case scenario is that the first battery exploded in forst step itself and we have to make iteration on by one.

        // total iteration in worst case will be
        // 1. one iteraton with first battery with initial step size (total 1)
        // 2. one iteration each starting from zero to initalStepSize -1 (we already know battery exploded at initial step size)
        // from step 1 and 2 we get '1+ (initialStepSize-1)'
        System.out.println(initialStepSize);
    }
}
