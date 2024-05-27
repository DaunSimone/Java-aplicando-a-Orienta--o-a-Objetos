public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.exibe();

        Calculadora calculadora = new Calculadora();       
        System.out.println( calculadora.calculaDobro(2));

        Musica musica = new Musica();
        musica.anoLancamento = 1980;
        musica.artista = "Latino";
        musica.titulo= "Festa no Apê";
        musica.avaliacao= 0;
        musica.numAvaliacoes = 0;
        musica.exibirFichaTecnica();
        musica.avaliarMusica(7.5);
        musica.avaliarMusica(10);
        System.out.println("Méda: "+ musica.calcularMediaAvaliacoes());

        Carro carro = new Carro();
        carro.ano= 2000;
        carro.cor="azul";
        carro.modelo="Jeep";
        carro.exibirFichaTecnica();
        System.out.println("Idade do carro: "+ carro.calcularIdadeCarro());

        Aluno aluno = new Aluno();
        aluno.setIdade(11);
        aluno.setNome("Maria");
        aluno.setNotas(5);
        aluno.setNotas(5);
        System.out.println("Média aluno: "+aluno.calcularMedia());

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(1);
        contaBancaria.setSaldo(10.5);
        System.out.println("Número da conta: "+ contaBancaria.getNumeroConta());
        System.out.println("Saldo da conta: "+ contaBancaria.getSaldo());

        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setIdade(25);
        idadePessoa.setNome("Pedro");
        idadePessoa.verificarIdade();
        idadePessoa.setIdade(15);
        idadePessoa.verificarIdade();
        idadePessoa.setIdade(18);
        idadePessoa.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("Bala");
        produto.setPreco(100);
        System.out.println("Preço com desconto: "+ produto.desconto(10));

        Livro livro = new Livro();
        livro.setAutor("Paulo Coelho");
        livro.setTitulo("O Alquimista");
        livro.exibirDetalhes();
    }
}
