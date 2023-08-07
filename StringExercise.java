public class StringExercise {
    private String inputString;
    private String outputString;

    public StringExercise() {
    }

    public StringExercise(String inputString, String outputString) {
        this.inputString = inputString;
        this.outputString = outputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }

    public String reverseString(String inp){
        StringBuilder stringBuilder = new StringBuilder(inp.trim());
        return String.valueOf(stringBuilder.reverse());
    }


}