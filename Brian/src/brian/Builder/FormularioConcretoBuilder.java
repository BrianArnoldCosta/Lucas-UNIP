/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian.Builder;


public class FormularioConcretoBuilder implements FormularioBuilder {
    private Formulario formulario = new Formulario();

    public void adicionarSecao(String nome) {
        formulario.adicionarSecao(new Secao(nome));
    }

    public Formulario construirFormulario() {
        return formulario;
    }
}