public class CadastroAluno {

    String nome;
    String email;
    int idade;
    double mensalidade;
    double desconto;
    double notaFinal;

    void saudacao() {
        System.out.println("Seja bem-vindo ao sistema " + nome);
    }

    void exibirCurso(String curso) {
        System.out.println("O seu curso é " + curso);
    }

    double calcularValorFinal() {
        return mensalidade - desconto;
    }

    double calcularNotas(double nota1, double nota2, double nota3) {
        return notaFinal = (nota1 + nota2 + nota3) / 3;
    }

}