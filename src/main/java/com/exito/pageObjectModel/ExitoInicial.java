package com.exito.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExitoInicial extends PageObject {
    private final By divMenu=By.xpath("//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 ']//span[@class='flex items-center nr2']//div[@id='category-menu']");
    private final By pJugueteria = By.xpath("//li[@class='exito-category-menu-3-x-itemCategoryMobile ' and @id='categorias-nivel2-Juguetería']//div[@class='exito-category-menu-3-x-contentCategory']");
    private final By contentCategoryJugueteria = By.cssSelector("#categorias-nivel2-Juguetería > div.exito-category-menu-3-x-contentCategory");

    private final By liCategory_Subcategory=By.xpath("//li[div[@class='exito-category-menu-3-x-squareHoverD']][@id='categorias-nivel2-Juegos de mesa']");


    private final By juegosDeMesa = By.xpath("//li[@id='categorias-nivel2-Juegos de mesa']");

    private final By divProductoSeleccionado=By.xpath("//div[@class='vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4']//div[@class='exito-vtex-components-4-x-buyButton productSummaryBuyButtonProductRich']");

    private final By divNombeProductoSeleccionado=By.xpath("//div[@class='vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4']//span[text()='Juego de Mesa Flip UNO']");
    private final By aCarritoCompra=By.xpath("//a[@class='exito-header-3-x-minicartLink']");
    private final By spanProductoCarrito=By.xpath("//span[text()='Juego de Mesa Flip UNO']");

    public By getDivMenu() {
        return divMenu;
    }

    public By getpJugueteria() {
        return pJugueteria;
    }
    public By getContentCategoryJugueteria() {
        return contentCategoryJugueteria;
    }

    public By getJuegosDeMesa() {
        return juegosDeMesa;
    }

    public By getDivProductoSeleccionado() {
        return divProductoSeleccionado;
    }

    public By getDivNombeProductoSeleccionado() {
        return divNombeProductoSeleccionado;
    }

    public By getaCarritoCompra() {
        return aCarritoCompra;
    }

    public By getSpanProductoCarrito() {
        return spanProductoCarrito;
    }

    public By getLiCategory_Subcategory() {
        return liCategory_Subcategory;
    }
}
