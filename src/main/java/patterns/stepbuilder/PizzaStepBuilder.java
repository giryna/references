package patterns.stepbuilder;

import java.util.ArrayList;
import java.util.List;

public class PizzaStepBuilder {

    private PizzaStepBuilder() {
        // defeating instantiation
    }

    public static FirstNameStep newBuilder() {
        return new Steps();
    }

    public interface FirstNameStep {
        DoughType pizzaCalled(String name);
    }

    public interface DoughType {
        MainFillingStep doughType(String doughType);
    }

    public interface MainFillingStep {
        CheeseStep meat(String meat);

        VegetableStep fish(String olives);
    }

    public interface CheeseStep {
        VegetableStep noCheesePlease();

        VegetableStep withCheese(String cheese);
    }

    public interface VegetableStep {
        BuildStep noMoreVegetablesPlease();

        BuildStep noVegetablesPlease();

        VegetableStep addVegetable(String vegetable);
    }


    public interface BuildStep {
        Pizza build();
    }

    private static class Steps implements FirstNameStep, DoughType, MainFillingStep, CheeseStep, VegetableStep, BuildStep {

        private String name;
        private String doughType;
        private String meat;
        private String fish;
        private String cheese;
        private final List<String> vegetables = new ArrayList<>();

        public DoughType pizzaCalled(String name) {
            this.name = name;
            return this;
        }

        public MainFillingStep doughType(String doughType) {
            this.doughType = doughType;
            return this;
        }

        public CheeseStep meat(String meat) {
            this.meat = meat;
            return this;
        }

        public VegetableStep fish(String fish) {
            this.fish = fish;
            return this;
        }

        public BuildStep noMoreVegetablesPlease() {
            return this;
        }

        public BuildStep noVegetablesPlease() {
            return this;
        }

        public VegetableStep addVegetable(String vegetable) {
            this.vegetables.add(vegetable);
            return this;
        }

        public VegetableStep noCheesePlease() {
            return this;
        }

        public VegetableStep withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Pizza build() {
            final Pizza pizza = new Pizza(name);
            pizza.setDoughType(doughType);

            if (fish != null) {
                pizza.setFish(fish);
            } else {
                pizza.setMeat(meat);
            }
            if (cheese != null) {
                pizza.setCheese(cheese);
            }
            if (!vegetables.isEmpty()) {
                pizza.setVegetables(vegetables);
            }
            return pizza;
        }
    }
}
