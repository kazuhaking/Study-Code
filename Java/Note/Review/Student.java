class Student {
    private String ID;
    private String name;
    private double score;

    public Student (String ID, String name, double score) {
        this.ID    = ID;
        this.name  = name;
        this.score = score;
    }

    public Student (){
        this("1", "Nghia", 8.59);
    }

    public String ID() {
        return this.ID;
    }
    public String name() {
        return this.name;
    }
    public double score() {
        return this.score;
    }

    public void ID(String ID) {
        this.ID = ID;
    }
    public void name(String name) {
        this.name = name;
    }
    public void score(double score) {
        this.score = score;
    }

    public String toString(){
        return "ID: " + this.ID + " - " + this.name + ": " + this.score;
    }
}