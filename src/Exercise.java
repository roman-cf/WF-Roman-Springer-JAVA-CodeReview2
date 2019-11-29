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
    public String formatTXT(String txtToFormat){
        int width = 30;
        int loops = txtToFormat.length()/width;

        if (loops>0) {
            for (int i = 1; i < loops; i++) {
                int pos =0;
                int y = Integer.parseInt(String.valueOf(this.description.substring(i * width).indexOf(" ")));
                txtToFormat = txtToFormat.substring(pos, (i * width) +y) + "\n" + txtToFormat.substring((i * width) + (y+1) , txtToFormat.length());
                pos++;
            }
        }
        return txtToFormat;
    }

    // create print method (using formatting) that prints those objects in a form like this:
    public String printExercise(){
        return this.exName + "\tDuration: "+ this.duration + " seconds \n--------------------------------------------------\nDESCRIPTION: " + formatTXT(this.description);
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
