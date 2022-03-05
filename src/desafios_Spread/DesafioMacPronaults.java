package desafios_Spread;

import java.util.Locale;
import java.util.Scanner;

public class DesafioMacPronaults {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int produtos=0, quantidade=0;
        double res=0, valor=0;
        int N = Integer.parseInt(scan.nextLine());

        for (int x=0 ; x<N ; x++){
            produtos = scan.nextInt();
            quantidade  = scan.nextInt();

            if (produtos == 1001)
                valor = 1.50;
            else if (produtos == 1002)
                valor = 2.50;
            else if (produtos == 1003)
                valor = 3.50;
            else if (produtos == 1004)
                valor = 4.50;
            else if (produtos == 1005)
                valor = 5.50;

            res += valor * quantidade;
        }
        System.out.printf("%.2f\n",res);
        scan.close();
    }
}