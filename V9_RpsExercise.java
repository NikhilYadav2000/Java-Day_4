import java.util.Scanner;

public class V9_RpsExercise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        int randNum = (int) (Math.floor(Math.random() * 3));
        // System.out.println(randNum);
        if (randNum == userNum) {
            System.out.println("Tie");
        }
        // 0 = stone , 1 = paper. 2 = scissor
        else if (randNum == 0 && userNum == 1) {
            System.out.println(randNum + "User Wins!!");
        } else if (randNum == 0 && userNum == 2) {
            System.out.println(randNum + "Computer Wins!!");
        } else if (randNum == 1 && userNum == 0) {
            System.out.println(randNum + "Computer Wins!!");
        } else if (randNum == 1 && userNum == 2) {
            System.out.println(randNum + "User Wins!!");
        } else if (randNum == 2 && userNum == 0) {
            System.out.println(randNum + "User Wins!!");
        } else if (randNum == 2 && userNum == 1) {
            System.out.println(randNum + "Computer Wins!!");
        }
    }
}


// public class cwh_41_ex2sol {
//     public static void main(String[] args) {
//         // 0 for Rock
//         // 1 for Paper
//         // 2 for Scissor

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
//         int userInput = sc.nextInt();

//         Random random = new Random();
//         int computerInput = random.nextInt(3);

//         if (userInput == computerInput) {
//             System.out.println("Draw");
//         }
//         else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
//                 || userInput == 2 && computerInput == 1) {
//             System.out.println("You Win!");
//         } else {
//             System.out.println("Computer Win!");
//         }
//         // System.out.println("Computer choice: " + computerInput);
//         if(computerInput==0){
//             System.out.println("Computer choice: Rock");
//         }
//         else if(computerInput==1){
//             System.out.println("Computer choice: Paper");
//         }
//         else if(computerInput==2){
//             System.out.println("Computer choice: Scissors");
//         }
//     }
// }