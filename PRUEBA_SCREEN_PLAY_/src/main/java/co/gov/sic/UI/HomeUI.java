package com.gov.sic.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    //public static final String SIC_WEBSITE_URL = "https://sic.gov.co/";
    public static Target btn_ProteccionDatos=Target.the("datos personales")
            .locatedBy("//a[@title='Protección de datos personales']");

}
