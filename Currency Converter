import java.util.*;
import java.text.DecimalFormat;
class CurrencyConverter{
    public static void main(){
        double rupee, dollar, pound ,code, euro, KWD;
        DecimalFormat f= new DecimalFormat("##.###");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to Vishal Currency Converter Project \n Below are the following Currency Code \n 1:Rupee \n 2: Dollar \n 3:Pound \n 4:Euro \n 5:Kuwati Dinar \n Please Enter your Currency Code Here");
            code= sc.nextInt();
            if(code==1){
                System.out.println("Enter the Amount in Rupees:");
                rupee = sc.nextDouble();
                dollar = rupee / 79.93;
                System.out.println("Dollar : " + f.format(dollar));
                pound = rupee / 94.55;
                System.out.println("Pound : " + f.format(pound));
                euro = rupee / 80.22;
                System.out.println("Euro : " + f.format(euro));
                KWD = rupee / 259.94;
                System.out.println("Kuwaiti Diner : " + f.format(KWD));
            }
                    else if (code==2){
                System.out.println("Enter the Amount in Dollar:");
                dollar=sc.nextDouble();
                rupee=dollar*79.93;
                System.out.println("Rupees : "+f.format(rupee));
                pound=dollar*0.85;
                System.out.println("Pound : " +f.format(pound));
                euro=dollar * 1;
                System.out.println("Euro : " +f.format(euro));
                KWD=dollar*0.31;
                System.out.println("Kuwait Dinner : "+f.format(KWD));
            }
                    else if (code==3){
                System.out.println("Enter the Amount in Pound:");
                pound=sc.nextDouble();
                rupee=pound*94.55;
                System.out.println("Rupee : " +f.format(rupee));
                dollar=pound*1.18;
                System.out.println("Dollar : " +f.format(dollar));
                euro=pound*1.18;
                System.out.println("Euro : " +f.format(euro));
                KWD=pound*0.363729;
                System.out.println("Kuwait Dinner : " +f.format(KWD));
            }
                else if (code==4){
                System.out.println("Enter the Amount in Euro");
                euro=sc.nextDouble();
                rupee=euro*80.22;
                System.out.println("rupee : " +f.format(rupee));
                dollar=euro*1;
                System.out.println("Dollar : " +f.format(dollar));
                pound=euro*0.85;
                System.out.println("Pound : " +f.format(pound));
                KWD=euro*0.31;
                System.out.println("Kuwait Dinner : " +f.format(KWD));
            }
                else if (code==5){
                System.out.println("Enter the amount in Kuwait Dinner");
                KWD= sc.nextDouble();
                rupee=KWD*259.94;
                System.out.println("Rupees: " +f.format(rupee));
                dollar=KWD*3.25;
                System.out.println("Dollar: " +f.format(dollar));
                pound=KWD*2.75;
                System.out.println("Pound : " +f.format(pound));
                euro=KWD*3.24;
                System.out.println("Euro : " +f.format(euro));
            }
                else
                System.out.println("Invalid Input");
        }
    }

}
