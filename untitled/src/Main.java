public class Main {
  public static void main(String[] args) {

    CadastroAluno aluno1 = new CadastroAluno();
    aluno1.nome = "Matheus";
    aluno1.email = "teste@gmail.com";
    aluno1.idade = 21;
    aluno1.mensalidade = 500;
    aluno1.desconto = 123;

    aluno1.saudacao();
    aluno1.exibirCurso("Testes de Software");
    System.out.println(aluno1.calcularValorFinal());

    double media =  aluno1.calcularNotas(8,7.3,6);

    System.out.printf("Media: %.1f",media);

  }
}