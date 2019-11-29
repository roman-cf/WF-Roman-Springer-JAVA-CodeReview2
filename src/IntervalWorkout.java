public class IntervalWorkout {
    private static int[] severalExercises;
    private static int repetitions;
    private int breaktime;

    public IntervalWorkout(int[] severalExercises, int repetitions, int breaktime) {
        this.severalExercises = severalExercises;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }
//---------------------------------------------
    public int getBreaktime() {
        return breaktime;
    }
    public static int[] getSeveralExercises() {
        return severalExercises;
    }
    public static int getRepetitions() {
        return repetitions;
    }
//---------------------------------------------
    public void workoutRound(){
        for (int i=0;i<IntervalWorkout.getSeveralExercises().length;i++){
            int tempIndex = IntervalWorkout.getSeveralExercises()[i];
                System.out.println(CodeReviewJ2.exercisesArr[tempIndex].getExName());
        }
    }

    public void printWorkout(){
        System.out.println("***************************** \n"+"Interval Workout STARTS !!!!\n"+"*****************************");
        for(int i=0;i<IntervalWorkout.getRepetitions();i++) {
            System.out.println("=============================");
            System.out.println("ROUND "+(i+1)+":");
            workoutRound();
            System.out.println("=============================\n" +
                    "DO THE BREAK ("+ this.getBreaktime()+" SECONDS)");
        }
            System.out.println("*****************************\n"+
                                "CONGRATS - YOU ARE DONE !!! \n"+
                               "*****************************\n");
    }
}
