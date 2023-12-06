package com.youtube.tasks;

import com.youtube.UI.YouTubeSearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HacerClicEnVideo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YouTubeSearchResultsPage.PRIMER_VIDEO)
        );
    }

    public static HacerClicEnVideo elVideo() {
        return new HacerClicEnVideo();
    }
}
