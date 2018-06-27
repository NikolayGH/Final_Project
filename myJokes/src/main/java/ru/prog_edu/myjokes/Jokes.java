package ru.prog_edu.myjokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jokes {

    private static final List<String> jokesList = Arrays.asList(
            "Siri, why am I still single?! - Siri activates front camera.",
            "Cremation. My final hope for a smokin’ hot body!",
            "What's the difference between snowmen and snowladies? Snowballs",
            "How do you make holy water? You boil the hell out of it.",
            "I get plenty of exercise - jumping to conclusions, pushing my luck, and dodging deadlines.",
            "Do not underestimate your abilities. That is your boss's job.",
            "Nothing makes me more productive than the last minute."
    );

    public static String getRandomJoke(){
        Random random = new Random();
        return jokesList.get(random.nextInt(jokesList.size()));
    }
}
