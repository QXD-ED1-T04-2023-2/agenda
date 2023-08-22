package com.example;

import java.util.ArrayList;

class Contato {
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
}

public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato();
        Contato c2 = new Contato();
        Contato c3 = new Contato();

        // * `ArrayList` é a implementação de "Listas Sequenciais" no Java.
        ArrayList<Contato> agenda = new ArrayList<>(1);

        c1.nome = "Fulanim da Silva";
        c1.telefone = "99999999";

        c2.nome = "Sicranim dos Santos";
        c2.telefone = "888888888";

        c3.nome = "Fulanim da Silva";
        c3.telefone = "99999999";

        // * A implementação de `add` sempre usa o próximo índice disponível.
        agenda.add(c1);
        agenda.add(c2);
        System.out.println("Nome: " + agenda.get(1).nome + ", Telefone: " +
                agenda.get(1).telefone);
        System.out.println(agenda.size());

        agenda.remove(c1);
        System.out.println("Nome: " + agenda.get(0).nome + ", Telefone: " +
                agenda.get(0).telefone);

        // * Este comando gera uma exceção, pois não temos como usar o índice 3
        // * mantendo todas as propriedades que mencionamos.
        // agenda.add(3, c1);
        agenda.add(c1);

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println("Nome: " + agenda.get(i).nome + ", Telefone: " +
                    agenda.get(i).telefone);
        }

        // * `indexOf` busca pelo objeto passado, mas usando a noção que ensinamos
        // * na implementação do método `equals`.
        System.out.println("Fulanim está no índice: " + agenda.indexOf(c3));
    }
}