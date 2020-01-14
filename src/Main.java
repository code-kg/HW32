public class Main {
    public static void main(String[] args) {
        Sellable [] goods = new Sellable[3];
        goods[0]=new Liquid();
        goods[1]=new Food();
        goods[2]=new Clothes();

        System.out.println(goods[0].good(" to drink"));
        System.out.println(goods[1].good(" to eat"));
        System.out.println(goods[2].good(" to wear"));
    }
}
