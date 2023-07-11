package Ficha02;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        // Instancia obrigatória do Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int a, b, c;
        String escolha;

        // Ler input do utilizador
        System.out.print("Insira um número: ");
        a = input.nextInt();

        System.out.print("Insira um número: ");
        b = input.nextInt();

        System.out.print("Insira um número: ");
        c = input.nextInt();

        System.out.print("Crescente (C) ou Decrescente (D): ");
        escolha= input.next();

        switch (escolha){
            case "C":// ______________ Crescente ______________
                if(a < b && a< c){ // a ... ...
                    if(b<c){ // a b c
                        System.out.println(a+" "+b+" "+c);
                    }else{ // a c b
                        System.out.println(a+" "+c+" "+b);
                    }
                }

                if(b<a && b<c){ // b ... ...
                    if(a<c){ // b a c
                        System.out.println(b+" "+a+" "+c);
                    }else{ // b c a
                        System.out.println(b+" "+c+" "+a);
                    }
                }

                if(c <a && c<b){ // c ... ...
                    if(a<b){ // c a b
                        System.out.println(c+" "+a+" "+b);
                    }else{ // c b a
                        System.out.println(c+" "+b+" "+a);
                    }
                }
                break;

            case "D":// ______________ Decrescente ______________
                if(a < b && a< c){ // ... ... a
                    if(b<c){ // c b a
                        System.out.println(c+" "+b+" "+a);
                    }else{ // b c a
                        System.out.println(b+" "+c+" "+a);
                    }
                }

                if(b<a && b<c){ // ... ... b
                    if(a<c){ // c a b
                        System.out.println(c+" "+a+" "+b);
                    }else{ // a c b
                        System.out.println(a+" "+c+" "+b);
                    }
                }

                if(c <a && c<b){ // ... ... c
                    if(a<b){ // b a c
                        System.out.println(b+" "+a+" "+c);
                    }else{ // a b c
                        System.out.println(a+" "+b+" "+c);
                    }
                }
                break;
        }



    }
}
