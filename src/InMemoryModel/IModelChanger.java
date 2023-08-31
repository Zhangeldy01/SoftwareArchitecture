package InMemoryModel;

public interface IModelChanger {
    void notifyChange(IModelChanger sender);

    void applyUpdateModel();
}
