
public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    private String Display;
    private String Os;
   //variabless
    private Computer(ComBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.Display = builder.Display;
        this.Os = builder.Os;
    }

 public static   class ComBuilder {
        private String CPU;
        private String RAM;
        private String Storage;
        private String Display;
        private String Os;

        public ComBuilder(String CPU) {
            this.CPU = CPU;
        }

        public ComBuilder setRam(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComBuilder setStorage(String Storage) {
            this.Storage = Storage;
            return this;
        }

        public ComBuilder setDisplay(String Display) {
            this.Display = Display;
            return this;
        }

        public ComBuilder setOs(String Os) {
            this.Os = Os;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }

}
class Main {
    public static void main(String[] args){
        Computer pc=new Computer.ComBuilder("AMD").setRam("Asus").setStorage("ssd").setDisplay("oled").setOs("Linux").build();
        System.out.println("CPU: " + pc.getCPU());
        System.out.println("RAM: " + pc.getRAM());

    }
}

