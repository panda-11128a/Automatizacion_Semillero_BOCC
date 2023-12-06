package com.gov.sic.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;


import static com.gov.sic.UI.HomeUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SICtask  implements Task {
@Override
public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Open.url("https://sic.gov.co"),
            Click.on(btn_ProteccionDatos)
    );
}
    public static SICtask on(){
        return instrumented(SICtask.class);
    }


}
