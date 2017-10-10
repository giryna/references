package patterns.stepbuilder;

public class Pizza {

    private String name;
    private String meatType;
    private String fishType;
    private String cheeseType;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", meatType='" + meatType + '\'' +
                ", fishType='" + fishType + '\'' +
                ", cheeseType='" + cheeseType + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
