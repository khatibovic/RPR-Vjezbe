package ba.unsa.etf.rpr;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile(File file) {
        this.file = file;
        this.laptopi = new ArrayList<>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            FileWriter fileWriter = new FileWriter(file, true);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fileWriter, laptop);
            fileWriter.write("\n");
            fileWriter.close();
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
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ObjectMapper objectMapper = new ObjectMapper();
                Laptop laptop = objectMapper.readValue(line, Laptop.class);
                lista.add(laptop);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
