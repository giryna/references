package patterns.stepbuilder;

public class PizzaStepBuilder {

    private PizzaStepBuilder() {
        // defeating instantiation
    }

    public static FirstNameStep newBuilder() {
        return new Steps();
    }

    public interface FirstNameStep {
        MeatStep pizzaCalled(String name);
    }

    public interface MeatStep {
        FishStep addMeat(String meatType);
    }

    public interface FishStep {
        CheeseStep addFish(String fishType);
    }

    public interface CheeseStep {
        SizeStep noCheesePlease();

        SizeStep withCheese(String cheeseType);
    }

    public interface SizeStep {
        BuildStep setSize(String size);
    }


    public interface BuildStep {
        Pizza build();
    }

    private static class Steps implements FirstNameStep, MeatStep, FishStep, CheeseStep, SizeStep, BuildStep {

        private String name;
        private String meatType;
        private String size;
        private String fishType;
        private String cheeseType;

        public MeatStep pizzaCalled(String name) {
            this.name = name;
            return this;
        }

        public FishStep addMeat(String meatType) {
            this.meatType = meatType;
            return this;
        }

        public CheeseStep addFish(String fishType) {
            this.fishType = fishType;
            return this;
        }

        public SizeStep noCheesePlease() {
            return this;
        }

        public SizeStep withCheese(String cheese) {
            this.cheeseType = cheese;
            return this;
        }

        public Pizza build() {
            final Pizza pizza = new Pizza();

            pizza.setName(name);
            pizza.setMeatType(meatType);
            pizza.setFishType(fishType);
            pizza.setCheeseType(cheeseType);
            pizza.setSize(size);

            return pizza;
        }

        @Override
        public BuildStep setSize(String size) {
            this.size = size;

            return this;
        }
    }
}
