class ProjectorTester {
    public static void main(String[] args) {
        Projector projector1 = new Projector();
        projector1.brand = "Epson";
        projector1.model = "PowerLite 1781W";
        projector1.resolution = "WXGA (1280x800)";
        projector1.brightness = 3200;
        projector1.isPortable = true;
        projector1.hasHDMI = true;
        projector1.bulbLife = 5000;
        projector1.connectivity = "Wireless";
        projector1.is3DCompatible = false;
        projector1.projectionTechnology = "LCD";
        projector1.toDisplay();
        
        System.out.println(projector1.resolution + " " + projector1.connectivity);

        Projector projector2 = new Projector();
        projector2.brand = "BenQ";
        projector2.model = "MH535FHD";
        projector2.resolution = "Full HD (1920x1080)";
        projector2.brightness = 3600;
        projector2.isPortable = false;
        projector2.hasHDMI = true;
        projector2.bulbLife = 10000;
        projector2.connectivity = "Wired";
        projector2.is3DCompatible = true;
        projector2.projectionTechnology = "DLP";
        projector2.toDisplay();
        
		
		System.out.println(projector2.resolution + " " + projector2.connectivity);

    }
}