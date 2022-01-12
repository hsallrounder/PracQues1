import java.util.*;

public class Q2_KV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++) arr.add(sc.nextInt());
        sc.close();
        HashMap<Integer,ArrayList<Integer>> mp = new HashMap();
        for(int i=0;i<arr.size();i++){
            if(mp.containsKey(arr.get(i))){
                mp.get(arr.get(i)).add(i);
            }
            else {
                mp.put(arr.get(i),new ArrayList(Arrays.asList(i)));
            }
        }
        boolean nodup=true;
        ArrayList<Integer> arrst = new ArrayList(new HashSet(arr));
        for(Integer i: arrst){
            if(mp.get(i).size()>1){
                nodup=false;
                System.out.print("Element "+ i + " has duplicates on indices : ");
                System.out.println(mp.get(i).toString());
            }
        }
        if(nodup){
            System.out.println("No duplicates were found.");
        }
    }
}
