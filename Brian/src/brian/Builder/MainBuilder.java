/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian.Builder;

/**
 *
 * @author Kaique
 */
public class MainBuilder {
    public static void main(String[] args) {
        FormularioBuilder builder = new FormularioConcretoBuilder();
        DiretorFormulario diretor = new DiretorFormulario(builder);

        Formulario formulario = diretor.construirFormularioCompleto();
        formulario.mostrarFormulario();
    }
}
