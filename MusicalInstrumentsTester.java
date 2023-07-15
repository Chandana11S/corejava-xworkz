class MusicalInstrumentsTester {
    public static void main(String[] args) {
        MusicalInstruments instrument = new MusicalInstruments();
        instrument.name = "Gibson Les Paul";
        instrument.type = "Electric Guitar";
        instrument.brand = "Gibson";
        instrument.material = "Mahogany";
        instrument.price = 1999.99;
        instrument.color = "Sunburst";
        instrument.isAcoustic = false;
        instrument.isElectric = true;
        instrument.numberOfKeys = 0;
        instrument.isPortable = true;
        instrument.play();
        System.out.println(instrument.name + "  " + instrument.brand + " " + instrument.isAcoustic + "   " + instrument.material);

        MusicalInstruments instrument1 = new MusicalInstruments();
        instrument1.name = "Yamaha U1";
        instrument1.type = "Acoustic Piano";
        instrument1.brand = "Yamaha";
        instrument1.material = "Wood";
        instrument1.price = 8999.99;
        instrument1.color = "Black";
        instrument1.isAcoustic = true;
        instrument1.isElectric = false;
        instrument1.numberOfKeys = 88;
        instrument1.isPortable = false;
        instrument1.play();
        System.out.println(instrument1.name + "   " + instrument1.brand + " " + instrument1.material + "   " + instrument1.numberOfKeys);
    }
}
