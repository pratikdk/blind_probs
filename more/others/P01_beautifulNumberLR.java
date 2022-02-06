// https://www.hackerearth.com/problem/algorithm/beautiful-numbers-05de0f51-101121ca/
import java.io.*;
import java.util.*;

public class P01_beautifulNumberLR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(int l, int r){
        // Your code goes here
        long rSum = 0;
        Set<Integer> bSet = new HashSet<>(); // remove bSet logic to pass #3 input 
        for (int i = l; i <= r; i++) {
            Set<Integer> iSet = new HashSet<>();
            int currNum = i;
            int loopThreshold = 20;
            while (!iSet.contains(currNum)) {
                iSet.add(currNum);
                int currSum = 0;
                while (currNum > 0) {
                    currSum += (int) Math.pow((currNum % 10), 2);
                    currNum /= 10;
                }
                currNum = currSum;
                loopThreshold--;
                if (currNum == 1) {
                    break;
                } else if (bSet.contains(currNum)) {
                    currNum = 1;
                    break;
                } else if (loopThreshold == 0) {
                    break;
                }
            }
            // offload iset
            if (currNum == 1) {
                bSet.addAll(iSet);
                rSum += i;
            }
        }
        return rSum;
    }
}
