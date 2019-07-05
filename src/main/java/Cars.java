import java.io.Serializable;

public class Cars implements Serializable {
    private int engineNumber;
    private int carIndex;
    private String modelName;

    public Cars(int engineNumber, int carIndex, String modelName) {
        this.engineNumber = engineNumber;
        this.carIndex = carIndex;
        this.modelName = modelName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public int getCarIndex() {
        return carIndex;
    }

    public String getModelName() {
        return modelName;
    }

    public String toString() {
        return modelName + ", body " + carIndex + ", engine " + engineNumber;
    }
}
