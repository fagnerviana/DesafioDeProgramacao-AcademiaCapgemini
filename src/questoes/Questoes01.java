package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questoes01 {

    public  static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            List<String> estrelinhas = new ArrayList<>();


            System.out.print("Digite a quantidade: ");
            int qtd = entrada.nextInt();

            for (int i = 0; i < qtd; i++) {
                estrelinhas.add(" ".repeat(qtd - i) + "*".repeat(i + 1));
            }
            for (String d : estrelinhas) {
                System.out.println(d);
           }
    }
}


