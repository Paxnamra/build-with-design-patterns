package creational.builder.imaginary_vehicle_shop;

public class VehicleShop {

    public static class Vehicle {

        private String frame;
        private String colour = null;
        private String engine = null;
        private int wheels = 0;
        private int doors = 0;

        public Vehicle(String frame) {
            this.frame = frame;
        }

        public VehicleShop createVehicle() {
            return new VehicleShop(this);
        }

        public Vehicle colour(String colour) {
            this.colour = colour;
            return this;
        }

        public Vehicle engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Vehicle wheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Vehicle doors(int doors) {
            this.doors = doors;
            return this;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Vehicle{");
            sb.append("frame='").append(frame).append('\'');
            sb.append(", colour='").append(colour).append('\'');
            sb.append(", engine='").append(engine).append('\'');
            sb.append(", wheels=").append(wheels);
            sb.append(", doors=").append(doors);
            sb.append('}');
            return sb.toString();
        }
    }

    private final String frame;
    private final String colour;
    private final String engine;
    private final int wheels;
    private final int doors;

    private VehicleShop(Vehicle vehicle) {
        this.frame = vehicle.frame;
        this.colour = vehicle.colour;
        this.engine = vehicle.engine;
        this.wheels = vehicle.wheels;
        this.doors = vehicle.doors;
    }
}
