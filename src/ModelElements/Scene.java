package ModelElements;

public class Scene {
    public int Id;
    public PoligonalModel models;
    public Flash flashes;
    public Camera cameras;

    public Scene(PoligonalModel models, Flash flashes, Camera cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
    public static <T> T method1(T type) {
        return type;
    }

    public static <T1, T2> T1 method2(T1 type1, T2 type2) {
        return type1;
    }
}

