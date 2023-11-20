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
    public void seleccionCategoriaSubcategoria(){
        exitoInicial.getDriver().findElement(exitoInicial.getLiCategory_Subcategory()).click();

    }
    @Step("Seleccionar producto")
    public void seleccionproducto(){
        exitoInicial.getDriver().findElement(exitoInicial.getDivProductoSeleccionado()).click();
    }
    @Step("Entrar al carrito de compras")
    public void entrarCarritoCOmpras(){
        exitoInicial.getDriver().findElement(exitoInicial.getaCarritoCompra()).click();
    }
    @Step("Validar producto")
    public void validacionProducto(){
        WebDriverWait wait = new WebDriverWait(exitoInicial.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(exitoInicial.getDivProductoSeleccionado()));
        String nombreProductoSeleccionado = wait.until(ExpectedConditions.visibilityOfElementLocated(exitoInicial.getDivNombeProductoSeleccionado())).getText();


        wait.until(ExpectedConditions.visibilityOfElementLocated(exitoInicial.getaCarritoCompra()));

        String nombreProductoEnCarrito = wait.until(ExpectedConditions.visibilityOfElementLocated(exitoInicial.getSpanProductoCarrito())).getText();

        Assert.assertEquals("El producto seleccionado y el producto en el carrito no son el mismo", nombreProductoSeleccionado, nombreProductoEnCarrito);
    }

}
