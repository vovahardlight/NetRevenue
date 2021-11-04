import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int totalIncome = read.nextInt();
                int taxPercent = read.nextInt();


                Income income=new Income();
                income.totalIncome=totalIncome;
                income.taxPercent=taxPercent;

                income.CalculateNetRevenue();
        System.out.println("Net revenue:"+income.getNetRevenue());
    }
}
class Income{
    public int totalIncome;
    public int taxPercent;
    private int netRevenue;
    public void CalculateNetRevenue(){
        netRevenue = totalIncome - ((totalIncome*taxPercent)/100);
        }
    public int getNetRevenue(){
        return netRevenue;
    }
}