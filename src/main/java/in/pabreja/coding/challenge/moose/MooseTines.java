package in.pabreja.coding.challenge.moose;

import java.util.Scanner;

/**
 * Problem A
 * /problems/judgingmoose/file/statement/en/img-0001.png
 * Picture by Ryan Hagerty/US Fish and Wildlife Service, public domain
 * When determining the age of a bull moose, the number of tines (sharp points), extending from the main antlers, can be used. An older bull moose tends to have more tines than a younger moose. However, just counting the number of tines can be misleading, as a moose can break off the tines, for example when fighting with other moose. Therefore, a point system is used when describing the antlers of a bull moose.
 * The point system works like this: If the number of tines on the left side and the right side match, the moose is said to have the even sum of the number of points. So, “an even -point moose”, would have three tines on each side. If the moose has a different number of tines on the left and right side, the moose is said to have twice the highest number of tines, but it is odd. So “an odd -point moose” would have  tines on one side, and  or less tines on the other side.
 *
 * Can you figure out how many points a moose has, given the number of tines on the left and right side?
 *
 * Input
 * The input contains a single line with two integers  and , where  is the number of tines on the left, and  is the number of tines on the right.
 *
 * Output
 * Output a single line describing the moose. For even pointed moose, output “Even ” where  is the points of the moose. For odd pointed moose, output “Odd ” where  is the points of the moose. If the moose has no tines, output “Not a moose”
 *
 * @author mandheer.pabreja
 * @since 14 March 2022
 * @version 1.0.1
 *
 */

public class MooseTines {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            displayMooseInfo(l,r);
        }
    }

    private static void displayMooseInfo(int leftTines,int rightTines){
        if(leftTines ==0 && rightTines == 0){
            System.out.println("Not a moose");
            return;
        }
        if(leftTines==rightTines){
            System.out.println("Even "+ leftTines*2);
        } else {
            System.out.println("Odd "+ Math.max(leftTines,rightTines) *2);
        }
        return;
    }
}
