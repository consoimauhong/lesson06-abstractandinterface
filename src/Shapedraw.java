public abstract class Shapedraw {
    private String color = "red";

    public Shapedraw(){
    }
    public String getColor(){
        return this.color;
    }
    public abstract void draw();

}
