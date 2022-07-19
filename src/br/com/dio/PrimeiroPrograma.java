package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);


        String nome;
        Livro livro = new Livro(nome; Object numPaginas;
        )
        {
        }
        System.out.println(livro);
        /*System.out.println("Hello, World!");*/
    }

    static class   Livro {
        private String nome;
        private String numPaginas;

        public Livro(String nome, String numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(String numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas='" + numPaginas + '\'' +
                    '}';
        }
    }
}
