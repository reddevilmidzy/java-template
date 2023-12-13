public class Model {
    private String name;

    private Model(String name) {
        this.name = name;
    }

    public static Model from(String value) {
        validate(value);
        return new Model(value);
    }

    private static void validate(String value) {
        //TODO: 제약조건
    }
}
