package com.ynov.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        // On parcours les nombre de 1 à 100
        // Le nombre courant sera stocké dans la variable primitive de type INT 'i'
        for(int i = 1; i <= 100; i++) {

            // '%' represente le modulo: le reste de la division
            // euclidienne de i par 3.
            // Le résultat est de 0 si i est un multiple de 3
            boolean isMultipleOf3 = (i % 3 == 0);
            boolean isMultipleOf5 = (i % 5 == 0);

            if(isMultipleOf3) {
                // Si i est multiple de 3, on affiche "fizz"
                System.out.print("fizz ");
            } else if(isMultipleOf5) {
                // Sinon, si i est multiple de 5, on affiche "buzz"
                System.out.print("buzz ");
            } else {
                // Si i n'est ni multiple de 3, ni multiple de 5, on affiche sa valeur
                System.out.print(i+" ");
            }
        }
    }

}
