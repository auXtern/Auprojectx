// 12S20048 - Jevania
import java.util.*;
import java.lang.Math;

public class Q01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nilaiHuruf, kredit;
        double performa;
        boolean ada;
        
        do {
            ada = false;
            kredit = input.nextLine();
            nilaiHuruf = input.nextLine();
            if (nilaiHuruf.equals("A") && !kredit.equals("---")) {
                performa = Integer.parseInt(kredit) * 4.0;
                ada = true;
            } else {
                if (nilaiHuruf.equals("AB") && !kredit.equals("---")) {
                    performa = Integer.parseInt(kredit) * 3.5;
                    ada = true;
                } else {
                    if (nilaiHuruf.equals("B") && !kredit.equals("---")) {
                        performa = Integer.parseInt(kredit) * 3.0;
                        ada = true;
                    } else {
                        if (nilaiHuruf.equals("BC") && !kredit.equals("---")) {
                            performa = Integer.parseInt(kredit) * 2.5;
                            ada = true;
                        } else {
                            if (nilaiHuruf.equals("C") && !kredit.equals("---")) {
                                performa = Integer.parseInt(kredit) * 2.0;
                                ada = true;
                            } else {
                                if (nilaiHuruf.equals("D") && !kredit.equals("---")) {
                                    performa = Integer.parseInt(kredit) * 1.0;
                                    ada = true;
                                } else {
                                    if (nilaiHuruf.equals("E") && !kredit.equals("---")) {
                                        performa = Integer.parseInt(kredit) * 0.0;
                                        ada = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (ada) {
                System.out.println(performa);
            }
        } while (!kredit.equals("---") && !nilaiHuruf.equals("---"));
    }
}
