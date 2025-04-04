public class Apple {
    private String color ;
    private Integer weight ; // i use Integer and not int cuz  the standred class Integer in java
                            // implements th Comparable interface

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                "weight='" + weight + '\'' +
                '}';
    }
}