public class Food implements Sellable {

    @Override
    public String good(String consume) {
        return "Food " + consume;
    }
}