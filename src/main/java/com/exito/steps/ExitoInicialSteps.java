package com.exito.steps;

import com.exito.pageObjectModel.ExitoInicial;
import com.exito.utils.Esperas;
import io.cucumber.java.*;
import net.thucydides.core.annotations.*;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExitoInicialSteps {
    @Page
    ExitoInicial exitoInicial;

    @Step("Abrir el navegador")
    public void abrirNavegadorExito(){
        exitoInicial.openUrl("https://www.exito.com");
    }

    @Step("Click Menu")
    public void clickMenu(){
        Esperas.espera1(exitoInicial.getDriver(), exitoInicial.getDivMenu());
        WebElement menuElement = exitoInicial.getDriver().findElement(exitoInicial.getDivMenu());
        menuElement.click();
    }

    /*@Step("Abrir categoría 'Juguetería' con click")
    public void seleccionCategoria(){
        // Esperar a que la categoría 'Juguetería' sea clickeable y luego hacer clic en ella
        Esperas.espera1(exitoInicial.getDriver(), exitoInicial.getpJugueteria());
        WebElement pJugueteriaElement = exitoInicial.getDriver().findElement(exitoInicial.getpJugueteria());
        pJugueteriaElement.click();
    }*/

    @Step("Abrir categoria y subcategoria")
    public void seleccionCategoriaSubcategoria() {
        // Crear una instancia de Actions
        Actions actions = new Actions(exitoInicial.getDriver());

        // Realizar el hover sobre el elemento de la categoría 'Juguetería'
        actions.moveToElement(exitoInicial.getDriver().findElement(exitoInicial.getLiCategory_Subcategory())).perform();

        // Esperar a que la subcategoría 'Juegos de mesa' sea visible
        Esperas.esperaVisible(exitoInicial.getDriver(), exitoInicial.getJuegosDeMesa());

        // Hacer clic en la subcategoría 'Juegos de mesa'
        exitoInicial.getDriver().findElement(exitoInicial.getJuegosDeMesa()).click();
    }

    @Step("Seleccionar producto")
    public void seleccionproducto(){
        exitoInicial.getDriver().findElement(exitoInicial.getDivProductoSeleccionado()).click();
    }
    @Step("Entrar al carrito de compras")
    public void entrarCarritoCOmpras(){
        exitoInicial.getDriver().findElement(exitoInicial.getaCarritoCompra()).click();
    }
    @Step("Agregar correo y click en confirmar")
    public void AddMailClickCheck() {
        Actions actions = new Actions(exitoInicial.getDriver());

        // Luego, interactuar con getInMail() y getBtnCheckMail()
        actions.moveToElement(exitoInicial.getDriver().findElement(exitoInicial.getInMail()))
                .click()
                .sendKeys("hola@gmail.com")
                .moveToElement(exitoInicial.getDriver().findElement(exitoInicial.getBtnCheckMail()))
                .click()
                .perform();
    }


}
