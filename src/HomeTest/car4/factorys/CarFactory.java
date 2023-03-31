package HomeTest.car4.factorys;


import HomeTest.car4.enums.*;
import HomeTest.car4.storages.Storage;
import HomeTest.car4.transports.Car;

import java.util.Arrays;
import java.util.Set;

import static java.lang.String.format;


public abstract class CarFactory {

    public static final int YEAR = 2022;

    protected final Color[] colors;
    protected final Model[] models;
    protected final WheelSize[] wheelSizes;
    protected final EngineVolume[] engineVolumes;
    protected final Set<Option> options;

    protected final Storage storage;

    public CarFactory(Color[] colors, Model[] models, WheelSize[] wheelSizes, EngineVolume[] engineVolumes, Set<Option> options) {
        this.colors = colors;
        this.models = models;
        this.wheelSizes = wheelSizes;
        this.engineVolumes = engineVolumes;
        this.options = options;
        this.storage = new Storage();
        fillStorageWithCars();
    }

    public abstract Car createCar(Model model, EngineVolume engineVolume, Color color, WheelSize wheelSize, Set<Option> options);

    public String getConfigurations() {
        return format(
                "Factory can produce: colors: %s, models: %s, wheelSizes: %s, engineVolumes: %s",
                Arrays.toString(colors),
                Arrays.toString(models),
                Arrays.toString(wheelSizes),
                Arrays.toString(engineVolumes),
                Arrays.toString(new Set[]{options})

        );
    }

    protected abstract void fillStorageWithCars();

}
