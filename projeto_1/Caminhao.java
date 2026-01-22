package projeto_1;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao (String placa, int ano, int eixo){
        super(placa, ano);
        setEixos(eixo);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados(){ // quando criamos o método para o Onibus, podemos perceber que o ônibus é um veículo que possui todos os atributos de veículo, que foi reaproveitado (o método exibeDados() da superclasse Veiculo, utilizando a palavra chave super, para reaproveitar o método que já está na superclasse), e o eixo que é um atributo específico da subclasse, que mostramos na tela por meio de um comando de impressão a parte, assim utilizando o conceito de sobreposição de métodos
        super.exibirDados();
        System.out.println("Eixos: "+eixos);
    }

    // a palavra extends que está na linha 1, serve para referenciar à superclasse Veiculo, ou seja, estamos dizendo que Caminhao é uma subclasse, utilizando o conceito de herança
}

