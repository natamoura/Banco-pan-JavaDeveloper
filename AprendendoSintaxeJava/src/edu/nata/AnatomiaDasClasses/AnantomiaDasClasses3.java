package edu.nata.AnatomiaDasClasses;

public class AnantomiaDasClasses3 {
    public static void main(String[] args) {
        // Como declarar variavel:Tipo nomeBemDefinido = Atribuição(Opcional em alguns casos)

            int idade = 23;
            double altura = 1.54;
            boolean verdadeira = true;    

        // Metodos
            int numeroUm = 5;
            int numeroDois = 5;
            int somar = somarNumeros(numeroUm, numeroDois);
            
            System.out.println(somar);
    }
        // Declarando Metodo: TipoRetorno NomeObjetivoNoInfinitivo parametro(s)

            public static int somarNumeros (int numeroUm,int numeroDois){
                return numeroUm+numeroDois;
            }
}
