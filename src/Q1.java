import java.util.Scanner;

class Company
{
    int products[];
    public Company(int t1,int t2, int t3) {
        products=new int[3];
        products[0]=t1;
        products[1]=t2;
        products[2]=t3;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Company salesman[]= new Company[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<salesman.length;i++){
            System.out.print("Enter the sales of 3 items sold by salesman "+(i+1)+": ");
            salesman[i]=new Company(sc.nextInt(), sc.nextInt(),sc.nextInt());
        }
        sc.close();
        for(int i=0;i<salesman.length;i++){
            System.out.print("Total Sales By Salesman "+(i+1)+" = ");
            System.out.println(salesman[i].products[0]+salesman[i].products[1]+salesman[i].products[2]);
        }
        for(int i=0;i<3;i++){
            System.out.print("Total sales of item "+(i+1)+" = ");
            int sum=0;
            for(int j=0;j<salesman.length;j++){
                sum+=salesman[j].products[i];
            }
            System.out.println(sum);
        }
    }
}
