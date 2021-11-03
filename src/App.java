import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double pi=3.14,alan;
        int yariCap,merkezAci;
        Scanner oku=new Scanner(System.in);
        System.out.print("yarı çapı giriniz:");
        yariCap=oku.nextInt();
        System.out.print("merkez açıyı giriniz:");
        merkezAci=oku.nextInt();
        alan=(pi*(yariCap*yariCap)*merkezAci)/360;
        System.out.println("daire diliminin alanı: "+alan);
        oku.close();

        
    }
}
