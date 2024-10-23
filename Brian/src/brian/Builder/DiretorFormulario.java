/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian.Builder;

/**
 *
 * @author Kaique
 */
public class DiretorFormulario {
    private FormularioBuilder builder;

    public DiretorFormulario(FormularioBuilder builder) {
        this.builder = builder;
    }

    public Formulario construirFormularioCompleto() {
        builder.adicionarSecao("Informações Pessoais");
        builder.adicionarSecao("Endereço");
        builder.adicionarSecao("Pagamento");
        return builder.construirFormulario();
    }
}
