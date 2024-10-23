/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Kaique
 */
public class ConfiguracaoSistema {
    private static ConfiguracaoSistema instancia;
    private String nomeSistema;
    private String versao;

    // Construtor privado para evitar instanciação direta
    private ConfiguracaoSistema() {
        // Inicializar variáveis de configuração
        this.nomeSistema = "EcoLogger";
        this.versao = "1.0";
    }

    // Método estático para obter a instância única
    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
