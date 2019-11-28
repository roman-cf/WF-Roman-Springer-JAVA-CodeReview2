public class CodeReviewJ2 {
    public static void main(String[] args) {

    // Using the text above, create 6 objects.
    Exercise fitex1 = new Exercise("Push-ups",
            "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.",
            30,
            true
    );
    Exercise fitex2 = new Exercise("Planks ",
            "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.",
            90,
            true
    );
    Exercise fitex3 = new Exercise("Squats",
            "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.",
            45,
            true
    );
    Exercise fitex4 = new Exercise("Backward Kick",
            "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.",
            60,
            true
    );
    Exercise fitex5 = new Exercise("Leg Curl ",
            "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.",
            90,
            false
    );
    Exercise fitex6 = new Exercise("Sidewards Back Stretch ",
            "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.",
            60,
            false
    );

    System.out.println(fitex1.printExercise());

    // (20) Put your objects into an array and call your printing method in the loop.
    Exercise[] exercisesArr = new Exercise[6];
    exercisesArr[0] = fitex1;
    exercisesArr[1] = fitex2;
    exercisesArr[2] = fitex3;
    exercisesArr[3] = fitex4;
    exercisesArr[4] = fitex5;
    exercisesArr[5] = fitex6;

    for(int i = 0; i < exercisesArr.length; i ++){
        System.out.println("\n"+ exercisesArr[i].printExercise());
    }

    // Create a new loop through the array  and print only:
    System.out.println("\n \nExercises on the floor only:");
    for (int i = 0; i < exercisesArr.length; i ++){
        if (exercisesArr[i].isPosition()){
            System.out.println(exercisesArr[i].printExercise());
        }
    }

    System.out.println("\n \nExercises that are on the floor and take more than a minute:");
    for (int i = 0; i < exercisesArr.length; i ++ ){
        if (exercisesArr[i].isPosition() && exercisesArr[i].getDuration()>60){
            System.out.println(exercisesArr[i].printExercise());
        }

    }


    }
}
