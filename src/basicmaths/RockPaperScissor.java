package basicmaths;

import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fplay,splay;
        int n = sc.nextInt();
        int fcount=0,scount=0;
        for(int i=0;i<n;i++){
            fplay = sc.next();
            splay = sc.next();
            if(fplay.equalsIgnoreCase(splay)) continue;
            else if((fplay.equals("rock")&&splay.equals("paper")) || (fplay.equals("paper")&&splay.equals("scissor")) || (fplay.equals("scissor")&&splay.equals("rock"))) scount++;  
            else if((splay.equals("rock")&&fplay.equals("paper")) || (splay.equals("paper")&&fplay.equals("scissor")) || (splay.equals("scissor")&&fplay.equals("rock"))) fcount++;
        }
        sc.close();
        System.out.println(fcount>scount?"1":"2");
    }
}

