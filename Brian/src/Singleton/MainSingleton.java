/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;


public class MainSingleton {
    public static void main(String[] args) {
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
        System.out.println("Sistema: " + config.getNomeSistema());
        System.out.println("Versão: " + config.getVersao());

        // Modificar a configuração
        config.setNomeSistema("EcoLoggerPlus");
        config.setVersao("2.0");

        // Obter a mesma instância
        ConfiguracaoSistema config2 = ConfiguracaoSistema.getInstancia();
        System.out.println("Sistema: " + config2.getNomeSistema());
        System.out.println("Versão: " + config2.getVersao());
    }
}