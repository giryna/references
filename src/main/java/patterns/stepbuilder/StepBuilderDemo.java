package patterns.stepbuilder;

public class StepBuilderDemo {
    public static void main(String[] args) {
        final Pizza pizza = PizzaStepBuilder.newBuilder()
                .pizzaCalled("New Pizza")
                .addMeat("pork")
                .addFish("salmon")
                .withCheese("brie")
                .setSize("XXL")
                .build();

        System.out.println(pizza);
    }
}
