package bike_builder;

public class Bike {

    private final BikeType typeOfBike;

    private Bike(BikeBuilder bikeBuilder) {
        this.typeOfBike = bikeBuilder.typeOfBike;
    }

    public String getBikeType() {
        return typeOfBike.name().toLowerCase();
    }

    public int getNumberOfWheels() {
        return typeOfBike.getNumberOfWheels();
    }

    @Override
    public String toString(){
        String s = "";

        if(getNumberOfWheels() > 1) {
            s = "s";
        }
        return getBikeType() + " has " + getNumberOfWheels() + " wheel" + s;
    }

    public static class BikeBuilder {

        private BikeType typeOfBike;

        public BikeBuilder withBikeTypeAs(BikeType bikeType) {
            this.typeOfBike = bikeType;
            return this;
        }

        public Bike build() {
            return new Bike(this);
        }

    }
}
