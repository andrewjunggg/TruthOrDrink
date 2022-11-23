package com.cs4750.android.truthordrink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;


import java.util.ArrayList;

public class Deck2 extends AppCompatActivity {

    ArrayList<String > s;
    ArrayAdapter arrayAdapter;
    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deck2);
        s=new ArrayList<String >();
        s.add("What animal am I most like? Describe how this species and I are similar.");
        s.add("Do any of your friends not like me?");
        s.add("What’s a habit, compulsion, or relationship you wish you could quit? (Everybody answers)");
        s.add("Have you ever stolen anything? What, and why? Do you still have it? (Everybody answers)");
        s.add("Do your best (or worst) impersonation of me. I promise to clap appreciatively. (Everybody answers)");
        s.add("What’s something you’ve done to try and be cool? (Everybody answers)");
        s.add("Describe the first time we met. What was your honest first impression of me?");
        s.add("What’s the worst thing you’ve ever had to do at work or school? How’d you handle it?");
        s.add("If I didn’t have my current job, what do you see me doing?");
        s.add("What’s something I do that you hate?");
        s.add("Describe your first real kiss. Then describe your last kiss.");
        s.add("Describe your worst bathroom-related disaster.");
        s.add("Have you ever been fired? If so, what for? If not, why not?");
        s.add("What’s something you think people should appreciate more about you?");
        s.add("What movie title describes your last relationship?");
        s.add("What are your vices? Have they gotten better or worse over time?");
        s.add("What’s something you miss about your last serious ex?");
        s.add("Do you think you are happier—or sadder—than the average person? Why?");
        s.add("When was the last time you thought you might die? What made you feel that way?");
        s.add("Am I friends with anyone you can’t fully endorse? Is there anything you think I should consider about them?");
        s.add("If you discover you’ll die today, what will be your biggest regret?");
        s.add("Your Google history has been made public. Which search is the hardest to explain?");
        s.add("How are we right for each other romantically? Certainly you can think of at least one way we’re compatible.");
        s.add("What was your most embarrassing moment that transpired in public? Let’s all relive it!");
        s.add("Have you ever done something you’re not proud of for money? (Outside of an official job.)");
        s.add("What are you anxious about? Can we reassure you?");
        s.add("If you had to eat one delectable part of my delicious body, what part would you choose?");
        s.add("What’s my greatest physical asset? Don’t be shy.");
        s.add("What’s something about your personal hygiene that you could be more rigorous about?");
        s.add("How often do you think about your own death? How, and when, do you suspect it will happen?");
        s.add("What’s something that’s definitely not my problem, but somehow always becomes my problem?");
        s.add("Tell us about a time you got more wasted than was advisable.");
        s.add("If you were to kill me, how would you do it?");
        s.add("What’s something you’ve always done—and only realized as an adult that it was weird?");
        s.add("What would you never, ever want my help with?");
        s.add("How would Childhood You describe you now? Would that kid like you?");
        s.add("If we were dying of thirst, how would we ration");
        s.add("the last bottle of water between all of us here?");
        s.add("Do you think you are more or less attractive than the average person? Why?");
        s.add("What’s an offense you’ve committed that could get you fired from work?");
        s.add("How long did it take you to get over your last ex? What did you do to get over it? Are you actually over it?");
        s.add("If I killed somebody, would you help me cover it up?");
        s.add("Tell us about your last breakup talk. Who said what? Anything you wish you’d said?");
        s.add("What’s the weirdest way you’ve ever earned money? How much did you get?");
        s.add("What’s the worst thing you’ve done in a relationship?");
        s.add("If we were to meet for the first time today, would we become friends?");
        s.add("Was your childhood happier than the average person’s?");
        s.add("Do you think you’re healthier, or more fit, than most people?");
        s.add("What type of person have you always wanted to date, but never had the chance?");
        s.add("Have you ever dated a friend’s ex? Ever wanted to?");
        s.add("You and I are dating. What’s going to break us up?");
        s.add("What are your insecurities? How do they manifest in your day-to-day life?");
        s.add("Have you ever had a pregnancy scare?");
        s.add("Write me a new  dating app bio in three sentences or less.");
        s.add("Have you ever been in love? How do you know?");
        s.add("Will we be friends in ten years?");
        s.add("Is there something that’s difficult to talk about amongst any of us here? Should we clear the air right now?");
        s.add("Of the people here, who is overdue for some kind words? Let’s offer some good vibes now.");
        s.add("How are we wrong for each other romantically?");
        s.add("What album title describes our relationship? What is our soundtrack?");
        s.add("Tell us about a secret you had to keep from your loved ones.");
        s.add("What did you get in major trouble for doing as a kid, and did you ever learn your lesson?");
        s.add("Our minds have traded bodies. What’s the first thing you’re going to do in my body?");
        s.add("Describe me in three words.");
        s.add("When was the last time you cried? What happened? Do you need a hug?");
        s.add("Do you think I have a more dominant or more submissive personality? Do you have any examples?");
        s.add("How comfortable are we with one another? What things would make us uncomfortable?");
        s.add("Do you think I care moreor less about my reputation than most people?");
        s.add("Have you ever had a discovery about your parents now that you’ve grown up?");
        s.add("What is your worst coping mechanism? Defense mechanism?");
        s.add("What’s the meanest thing you’ve seen me do?");
        s.add("Is there a limit to what you would do for the right amount of money?");
        s.add("Do you think you’re more prone to addiction than other people? Either way, how do you know?");
        s.add("Describe my perfect life partner. Have I been on the right track to find this person?");
        s.add("Have you broken any bones? What happened? Did you hear the crack?");
        s.add("What’s a time when you let a problem go on for too long before you addressed it?");
        s.add("When was the last time you spoke to an ex? What was it about? Was there any tension?");
        s.add("If I were a chain restaurant, which one would I be and why?");
        s.add("Have you ever talked about me behind my back? If yes, what did you say?");
        s.add("If someone offered you $10,000 to never talk to me again, would you?");
        s.add("Someone who’s never met me asks you what I’m like. How do you answer?");
        s.add("What’s something you think people should never joke about?");
        s.add("Tell us about the one that got away.");
        s.add("When was the last time you lost your cool? What happened? How do you feel about it now?");
        s.add("What’s something you’re still self-conscious about? Are you working on it?");
        s.add("If you found out I’d been embezzling from work, would you rat me out?");
        s.add("Assuming you were single, what would it take for you to get back together with your last ex?");
        s.add("Have I ever told you a secret that you’ve let slip to a third party?");
        s.add("Describe a time when you really disappointed someone. Did you ever earn back their trust?");
        s.add("Who’s the smartest person here? Give us examples.");
        s.add("Describe a way I’ve impacted your life—but may not know about.");
        s.add("What’s a grand gesture you tried to save or repair a relationship?");
        s.add("What is something you’re struggling with that we don’t know about?");
        s.add("If I listed you as my job reference, what would you say about me? Would it all be true?");
        s.add("Tell us about a time you lied to your parents. Did they ever find out?");
        s.add("Tell us about a time you were shot down romantically.");
        s.add("Have you ever caught me in a lie? Did you confront me about it? Why or why not?");
        s.add("Tell us about a time you shot someone down romantically.");
        s.add("Help me with my ten-year plan. Describe my ideal job, income, relationship status, and attitude ten years from now.");
        s.add("What’s your most expensive mistake?");
        s.add("Do you have any scars you want to show us? Pick one and tell us the story behind how you got it.");
        s.add("When was the last time you lied to me? What was the lie?");
        s.add("How many kids is too many kids? How many will you have?");
        s.add("Of the people here, who do you think makes the most money? What makes you think so?");
        s.add("What would we do on our first date? (If asking partners or exes: What did you do on your first date?)");
        s.add("Have you ever pooped yourself as an adult?");

        SwipeFlingAdapterView swipeFlingAdapterView=(SwipeFlingAdapterView) findViewById(R.id.card);

        arrayAdapter=new ArrayAdapter<String>(this, R.layout.details, R.id.textView, s);
        swipeFlingAdapterView.setAdapter(arrayAdapter);
        swipeFlingAdapterView.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter(){
                s.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object o){

            }

            @Override
            public void onRightCardExit(Object o){

            }

            @Override
            public void onAdapterAboutToEmpty(int i){

            }

            @Override
            public void onScroll(float v){

            }


        });

    }
}