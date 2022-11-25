import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double para,kdvTutari,totalPara,kdvOrani =0.18;
        boolean kdvDegisim;

        System.out.print("Para miktarını giriniz:");
        Scanner input = new Scanner(System.in);
        para = input.nextDouble();
        if(para<1000 && para>0){
            kdvOrani = 0.18;
        }
        else if(para >1000){
            kdvOrani = 0.08;

        }

        kdvTutari = ( para * kdvOrani);
        totalPara = para + kdvTutari;

        System.out.println("KDV'siz FİYAT=" +para);
        System.out.println("KDV oranı="+kdvOrani);
        System.out.println("KDV'li FİYAT=" +totalPara);
        System.out.println("KDV tutarı=" +kdvTutari);





    }


}
