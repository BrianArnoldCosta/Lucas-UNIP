/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brian.Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaique
 */
public class Formulario {
    private List<Secao> secoes = new ArrayList<>();

    public void adicionarSecao(Secao secao) {
        secoes.add(secao);
    }

    public void mostrarFormulario() {
        for (Secao secao : secoes) {
            System.out.println(secao.getNome());
        }
    }
}

