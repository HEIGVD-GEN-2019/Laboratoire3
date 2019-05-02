package ch.heigvd.gen.component;

public class RegularSquare extends Square {
    public RegularSquare(String name, int number) {
        super(name, number);
    }

    @Override
    public void landedOn(Player player) {
        System.out.println(" Regular Square");
    }
}
