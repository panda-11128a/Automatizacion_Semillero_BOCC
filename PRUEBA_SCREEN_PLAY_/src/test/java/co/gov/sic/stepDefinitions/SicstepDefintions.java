package com.gov.sic.stepDefinitions;

import com.gov.sic.tasks.SICtask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SicstepDefintions {

    public void setupActor() {
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abra el navegador")
    public void queElUsuarioAbraElNavegador() {
        theActorCalled("user").wasAbleTo(
                SICtask.on()
        );


    }
    @Cuando("de click en proteccion del consumidor")
    public void deClickEnProteccionDelConsumidor() {
        // Write code here that turns the phrase above into concrete actions
        
    }
    @Cuando("abra abeas data del consumidor")
    public void abraAbeasDataDelConsumidor() {
        // Write code here that turns the phrase above into concrete actions
        
    }
    @Entonces("valide cualquier item del abeas data del consumidor")
    public void valideCualquierItemDelAbeasDataDelConsumidor() {
        // Write code here that turns the phrase above into concrete actions
        
    }
}
