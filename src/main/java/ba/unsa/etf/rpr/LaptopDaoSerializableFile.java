package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;


    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try (ObjectOutputStream izlaz = new ObjectOutputStream(new FileOutputStream(file))) {
            izlaz.writeObject(laptop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Laptop getLaptop(String procesor) throws Exception {
        for (Laptop laptop : laptopi) {
            if (laptop.getProcesor().equals(procesor)) return laptop;
        }
        throw new Exception("U listi nema laptopa sa: "+procesor+" procesorom");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeizDatoteke() {
        ArrayList<Laptop> lista = new ArrayList<>();
        try (ObjectInputStream ulaz = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Laptop laptop = (Laptop) ulaz.readObject();
                    lista.add(laptop);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    }
