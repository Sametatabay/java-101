import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       int mat,fzk,kmy,bylg,msc,bdn;
       Scanner inp = new Scanner(System.in);

       System.out.println("Mathematic Point Input : ");
       mat = inp.nextInt();

        System.out.println("Fizik Point Input : ");
        fzk = inp.nextInt();

        System.out.println("Kimya Point Input : ");
        kmy = inp.nextInt();

        System.out.println("Biyologi Point Input : ");
        bylg = inp.nextInt();

        System.out.println("Music Point Input : ");
        msc= inp.nextInt();

        System.out.println("Beden Point Input : ");
        bdn = inp.nextInt();

        int total = mat+fzk+kmy+bylg+msc+bdn;
        double ort = total/6;

        boolean kosul1 = ort<50;
        boolean kosul2 = ort>=50;
        boolean result = kosul1 || kosul2;

        String str = result ? "Geçti" : "Geçemedi";
        System.out.println(str);













    }
}
