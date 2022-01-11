import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++) arr.add(sc.nextInt());
        sc.close();
        ArrayList<Integer> arrst = new ArrayList(new HashSet(arr));
        ArrayList<ArrayList<Integer>> a = new ArrayList();
        ArrayList<Integer> x;
        for(int i=0;i<arrst.size();i++){
            x=new ArrayList();
            for(int j=0;j<arr.size();j++){
                if(arrst.get(i)==arr.get(j)){
                    x.add(j);
                }
            }
            a.add(x);
        }
        boolean nodup=true;
        for(int i=0;i<a.size();i++){
            if(a.get(i).size()>1){
                nodup=false;
                System.out.print("Element "+ arrst.get(i) + " has duplicates on indices : ");
                System.out.println(a.get(i).toString());
            }
        }
        if(nodup){
            System.out.println("No duplicates were found.");
        }
    }
}
