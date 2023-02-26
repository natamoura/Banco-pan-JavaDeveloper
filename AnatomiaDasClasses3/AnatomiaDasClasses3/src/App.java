public class App {
    public static void main(String[] args) throws Exception {
        // Declarando variaveis e metodos
        // Tipo nomeBemDefinido = atribuição (Opcional em alguns casos)
            int idade = 23;
            double altura = 1.62;
            String meuNome = "Natã";
            boolean sinNao = true;

            idade = 22;


        //Metodo
        // TipoRetorno NomeObjetivonoInfinitivo Parametro(s)
            String primeiroNome = "Natã";
            String segundoNome = "Moura";

            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

            System.out.println(nomeCompleto);
    }
    
    // Metodos declarando
        public static String nomeCompleto (String primeiroNome, String segundoNome){
            return primeiroNome.concat(" ").concat(segundoNome);
        }
}
