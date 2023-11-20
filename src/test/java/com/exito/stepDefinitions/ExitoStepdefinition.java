package com.exito.stepDefinitions;

import com.exito.steps.ExitoInicialSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.*;

public class ExitoStepdefinition {
    @Steps
    ExitoInicialSteps exitoInicialSteps;
    @Dado("que el usuario abra el navegador")
    public void queElUsuarioAbraElNavegador() {
        exitoInicialSteps.abrirNavegadorExito();
        
    }
    @Cuando("el usuario de click e ingrese al menu lateral superior izquierda de la pagina")
    public void elUsuarioDeClickEIngreseAlMenuLateralSuperiorIzquierdaDeLaPagina() {
        exitoInicialSteps.clickMenu();

        
    }
    @Cuando("seleccione la categoria Jugueteria y la subcategoria juegos de mesa")
    public void seleccioneLaCategoriaJugueteriaYLaSubcategoriaJuegosDeMesa() {
        /*exitoInicialSteps.seleccionCategoria();*/
        exitoInicialSteps.seleccionCategoriaSubcategoria();
        
    }
    @Cuando("escoja el juego UNO Juego de Mesa Flip Uno y agregue el producto al carrito")
    public void escojaElJuegoUNOJuegoDeMesaFlipUnoYAgregueElProductoAlCarrito() {
        exitoInicialSteps.seleccionproducto();
        
    }
    @Entonces("el usuario verificara el producto en el carrito")
    public void elUsuarioVerificaraElProductoEnElCarrito() {
        exitoInicialSteps.entrarCarritoCOmpras();
        exitoInicialSteps.validacionProducto();
        
    }
}
