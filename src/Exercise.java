public class Exercise {
    private String exName;
    private String description;
    private int  duration;
    private boolean position;

    public Exercise(String exName, String description, int duration, boolean position) {
        this.exName = exName;
        this.description = description;
        this.duration = duration;
        this.position = position;
    }

    // create print method (using formatting) that prints those objects in a form like this:
    public String printExercise(){
        return this.exName + "\tDuration: "+ this.duration + " seconds \n--------------------------------------------------\nDESCRIPTION: " + this.description;
    }

    public boolean isPosition() {
        return position;
    }

    public int getDuration() {
        return duration;
    }

    public String getExName() {
        return exName;
    }
}
