package young.project.android.com.libjava;

import java.util.Random;

public class Jokes {

    private static String[] jokeArray = new String[]{
            "Shout out to anyone wondering what the opposite of in is.",
            "Whiteboards are remarkable.",
            "There's no \"i\" in denial.",
            "There's no \"I\" in gullible",
            "There's no I in colaboraton",
            "Remains to be seen if glass coffins become popular.",
            "A joke becomes a dad joke when the punchline is apparent.",
            "This morning I was staring at my naked body in the mirror and thought \"I'm gonna get kicked out of this Ikea pretty soon\".",
            "The difference between a hippo and a Zippo is that one is heavy and the other is a little lighter.",
            "On the other hand, you have different fingers.",
            "The worst time to have a heart attack is during a game of charades.",
            "I, for one, like Roman numerals.",
            "My doctor just told me I'm suffering from paranoia... I mean he didn't actually say that, but I knew that's what the snide bastard was thinking.",
            "My wife and I were happy for twenty years. Then we met.",
            "Say what you want about deaf people.",
            "Does the name Pavlov ring a bell?",
            "I just accidentally swallowed a bunch of scrabble tiles. My next trip to the bathroom could spell disaster.",
            "This is my step ladder. I never knew my real ladder.",
            "Anybody who believes in telekinesis raise my hand.",
            "My lack of knowledge on Greek Literature has always been my Achilles' elbow.",
            "Saying \"I'm sorry\" is the same as saying \"I apologize.\" Except at a funeral.",
            "God said unto Abraham \"come forth and be granted eternal life\" but Abraham came fifth and won a toaster.",
            "How long is a chinese name.",
            "I told my girlfriend she was drawing her eyebrows too high. She looked surprised.",
            "I used to piss myself every time I was in front of my 3rd grade class, ruined my teaching career.",
            "My friend keeps annoying me with bird puns, well Toucan play at that game.",
            "I used to be arrogant but now I'm perfect.",
            "If at first you don't succeed, skydiving might not be for you.",
            "If I had a dollar for every girl that found me unattractive, they would eventually find me attractive.",
            "One time I was at the park wondering why does a Frisbee keeps looking bigger the closer it gets to you. And then it hit me.",
            "A dyslexic person walks into a bra...",
            "Dark humor is like food in Ethiopia, not everyone gets it."
    };

    public static String getJoke(){
        Random random = new Random();
        return jokeArray[random.nextInt(jokeArray.length)];
    }


}
