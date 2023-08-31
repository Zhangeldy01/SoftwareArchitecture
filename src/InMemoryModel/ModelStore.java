package InMemoryModel;

import ModelElements.*;

public class ModelStore implements IModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObserver;

    public ModelStore(IModelChangeObserver changeObserver, Point3D points) {
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(new Poligon(points));
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
        this.flashes = new Flash();
        this.cameras = new Camera();

    }

    public Scene getScenes(int Id) {
        return this.scenes;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }

    @Override
    public void applyUpdateModel() {

    }

}

