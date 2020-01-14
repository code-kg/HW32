public class Liquid implements Sellable {

    @Override
    public String good(String consume) {
        return "Liquid" + consume;
    }
}
