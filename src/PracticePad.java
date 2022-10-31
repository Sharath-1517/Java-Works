import java.util.*;
public class PracticePad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> con_val = new ArrayList<>();
        int number = sc.nextInt();
        for(int i = 0 ; i < number ; i++){
            int value = sc.nextInt();
            arr.add(value);
        }
        int count = 0;
        for(int i = 0;i < number;i++){
            for(int j = 0;j < number;j++){
                if((arr.get(i)==arr.get(j)) && (!con_val.contains(arr.get(i))) && (i!=j))
                    con_val.add(arr.get(i));
                count++;
            }
        }
        System.out.println(count);
    }
}