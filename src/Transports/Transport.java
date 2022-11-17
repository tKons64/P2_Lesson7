package Transports;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

    public Transport(String brand, String model, int engineVolume) {
        this.setBrand(brand);
        this.setModel(model);
        this.setEngineVolume(engineVolume);
    }

    private boolean parameterIsNotCorrect(String parametr) {
        return (parametr == null || parametr.isEmpty() || parametr.isBlank());
    }

    public void startMoving() {
        System.out.printf("Авто %s %s стартовало", getModel(), getBrand());
    }

    public void finishMoving() {
        System.out.printf("Авто %s %s закончило движение", getModel(), getBrand());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (!parameterIsNotCorrect(brand)) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        if (parameterIsNotCorrect(model)) {
            this.model = "default";
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }
}
