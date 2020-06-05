import java.util.Scanner;

public class tictac {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        Boolean p=false;
        boolean inp=true;
        boolean win=false;
        int count_=0;
        char ar[] = new char[9];
        int b[]=new int[9];
        for(int i=0;i<9;i++){
            ar[i]=' '; }
        System.out.println("---------");
        System.out.println("| " + ar[0] + " " + ar[1] + " " + ar[2] + " |");
        System.out.println("| " + ar[3] + " " + ar[4] + " " + ar[5] + " |");
        System.out.println("| " + ar[6] + " " + ar[7] + " " + ar[8] + " |");
        System.out.println("---------");
        int x=0; int y=0;
        while(win==false) {
            p = false;
            inp = true;

            while (p == false) {
                do {
                    try {
                        System.out.println("Enter the coordinates:");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        inp = true;
                    } catch (Exception e) {
                        System.out.println("You should enter numbers!");
                        inp = false;
                    }
                    sc.nextLine();
                } while (inp == false);
                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    inp = false;
                }

                if (inp == true) {
                    int count = 0;
                    for (int i = 3; i > 0; i--) {
                        for (int j = 1; j < 4; j++) {
                            if (x == j && y == i) {

                                if (ar[count] == '_' || ar[count] == ' ') {
                                    ar[count] = 'X';
                                    p = true;
                                }
                               else if (ar[count] != '_' || ar[count] != ' ') {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    p = false;
                                }
                            }
                            count++;
                        }
                    }
                }
                if (p == true) {

                    System.out.println("---------");
                    System.out.println("| " + ar[0] + " " + ar[1] + " " + ar[2] + " |");
                    System.out.println("| " + ar[3] + " " + ar[4] + " " + ar[5] + " |");
                    System.out.println("| " + ar[6] + " " + ar[7] + " " + ar[8] + " |");
                    System.out.println("---------");
                }
            }
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (ar[i] == 'X' && ar[i + 3] == 'X' && ar[i + 6] == 'X') count++; }
            for (int i = 0; i < 7; i = i + 3) {
                if (ar[i] == 'X' && ar[i + 1] == 'X' && ar[i + 2] == 'X') count++; }
            if ((ar[0] == 'X' && ar[4] == 'X' && ar[8] == 'X') || (ar[2] == 'X' && ar[4] == 'X' && ar[6] == 'X')) {
                count++; }
            count_=0;
            for(int i=0;i<9;i++) {
                if (ar[i] == ' ' || ar[i] == '_') count_++; }
            if (count == 1 ) {
                if (count == 1) System.out.print("X wins");
                win = true;
            }
            else if(count_==0){
                System.out.print("draw");
                win=true;
            }
            p = false;
            inp = true;
            while (p == false && win==false) {
                do {
                    try {
                        System.out.println("Enter the coordinates:");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        inp = true;
                    } catch (Exception e) {
                        System.out.println("You should enter numbers!");
                        inp = false;
                    }
                    sc.nextLine();
                } while (inp == false);
                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    inp = false;
                }

                if (inp == true) {
                    count = 0;
                    for (int i = 3; i > 0; i--) {
                        for (int j = 1; j < 4; j++) {
                            if (x == j && y == i) {

                                if (ar[count] == '_' || ar[count] == ' ') {
                                    ar[count] = 'O';
                                    p = true;
                                }
                                else if (ar[count] != '_' || ar[count] != ' ') {
                                    System.out.println("This cell is occupied! Choose another one!");
                                    p = false;
                                }
                            }
                            count++;
                        }
                    }
                }
                if (p == true) {

                    System.out.println("---------");
                    System.out.println("| " + ar[0] + " " + ar[1] + " " + ar[2] + " |");
                    System.out.println("| " + ar[3] + " " + ar[4] + " " + ar[5] + " |");
                    System.out.println("| " + ar[6] + " " + ar[7] + " " + ar[8] + " |");
                    System.out.println("---------");
                }
            }
            if(win==false) {
                int count1 = 0;
                count=0;
                for (int i = 0; i < 3; i++) {
                    if (ar[i] == 'O' && ar[i + 3] == 'O' && ar[i + 6] == 'O') count1++;
                }
                for (int i = 0; i < 7; i = i + 3) {
                    if (ar[i] == 'O' && ar[i + 1] == 'O' && ar[i + 2] == 'O') count1++;
                }
                if ((ar[0] == 'O' && ar[4] == 'O' && ar[8] == 'O') || (ar[2] == 'O' && ar[4] == 'O' && ar[6] == 'O')) {
                    count1++;
                }
                count_ = 0;
                for (int i = 0; i < 9; i++) {
                    if (ar[i] == ' ' || ar[i] == '_') {
                        count_++;
                    }
                }
                if (count1 == 1) {
                    if (count1 == 1) {
                        System.out.print("O wins");
                    }
                    win = true;
                } else if (count_ == 0) {
                    System.out.print("Draw");
                    win = true;
                }
            }
        }

    }
}
