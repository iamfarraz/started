import java.util.Arrays;
import java.util.Scanner;
public class chk_sdku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sdku[][] = new int[n * n][n * n];
        int chck[]= new int[n*n];
        boolean ordr=true;
        int box[]= new int[n*n];
        int r[]= new int[n*n];
        int c[]= new int[n*n];
        int count=0;
        for (int i = 0; i < n * n; i++) {//input of sudoku
            for (int j = 0; j < n * n; j++) {
                sdku[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n * n; i++){// to checking sudoku
            chck[i]=i+1;
        }



        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                r[j]=sdku[i][j];//row
                c[j]=sdku[j][i];//column
            }
            Arrays.sort(r);
            Arrays.sort(c);
            if(Arrays.equals(chck,r) && Arrays.equals(chck,c) ){
                continue;
            }
            else{
                ordr=false;
                break;
            }
        }
        if (ordr) {
            for (int b = 0; b < n * n; b = b + n) {    //sq grid coulmn change
                for (int a = 0; a < n * n; a = a + n) {//sq grid check in rows
                    int k = 0;
                    for (int i = a; i < a + n; i++) {
                        for (int j = b; j < b + n; j++) {
                            box[k] = sdku[i][j];
                            k++;
                        }
                    }
                    Arrays.sort(box);
                    if (Arrays.equals(chck, box)) {
                        count++;
                        continue;
                    } else {
                        ordr =false;
                        break;
                    }
                }
            }
           if(ordr){
               System.out.print("YES");
           }
           else{
               System.out.print("NO");
           }
        }
       else{
            System.out.print("NO");
        }
    }
}
