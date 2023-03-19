package Classes;

public class Constructor_without_parameters  extends Exception {
    public Constructor_without_parameters(String type) {
        super(String.format("Тип %s", type));
    }
}
