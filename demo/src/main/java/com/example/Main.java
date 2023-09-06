package com.example;

import java.util.ArrayList;
import java.util.Collections;

class Contato implements Comparable<Contato> {
    public String nome;
    public String telefone;

    // * Precisamos implementar este método para que o Java saiba como comparar
    // * objetos desta classe com outros objetos.
    // * (Por padrão, compara-se apenas se são exatamente o *mesmo* objeto, e
    // * se possuem o mesmo conteúdo)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contato) {
            Contato outro = (Contato) obj;

            // * A classe `String` já vem implementada com a noção de igualdade
            // * entre *conteúdo*, por isso podemos fazer como abaixo.
            return this.nome.equals(outro.nome) && this.telefone.equals(outro.telefone);
        }

        return false;
    }

    @Override
    public int compareTo(Contato other) {
        return this.nome.compareTo(other.nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();

        // * `ArrayList` é a implementação de "Listas Sequenciais" no Java.
        ArrayList<Contato> agenda = new ArrayList<>();

        c1.nome = "Fulanim da Silva";
        c1.telefone = "99999999";

        c2.nome = "Sicranim dos Santos";
        c2.telefone = "988888888";

        c3.nome = "Beltranim Rodrigues";
        c3.telefone = "977777777";

        agenda.add(c1);
        agenda.add(c2);
        agenda.add(c3);

        for (Contato c : agenda) {
            System.out.println(c.nome);
        }

        Collections.sort(agenda);
        System.out.println("------");

        for (Contato c : agenda) {
            System.out.println(c.nome);
        }

    }
}