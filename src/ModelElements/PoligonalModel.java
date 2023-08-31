package ModelElements;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;
    public PoligonalModel(Poligon poligon){
        this.poligons = poligon;
    }

    public Texture getTextures() {
        return this.textures;
    }

    public void setTextures(Texture textures) {
        this.textures = textures;
    }
}

