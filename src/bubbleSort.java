import java.util.ArrayList;
import java.util.Random;

public class bubbleSort {
    public static void bubbleS(ArrayList<Integer> array){
        int temp=0;
        int n = array.size();
        //swap value
        System.out.println(array.size());

        for (int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if(array.get(j)>array.get(j+1)){
                    temp = array.get(j);
                    array.set(j,array.get(j+1));
                    array.set((j+1),temp);
                }
            }
        }
    }
    //main function
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(); // Create an ArrayList object

        Random random = new Random();
        for (int i=0;i<10;i++) {
        array.add(random.nextInt()); }
        bubbleS(array);
        System.out.println("Bubble Sorted Random Array:"+array);
        }
    }


