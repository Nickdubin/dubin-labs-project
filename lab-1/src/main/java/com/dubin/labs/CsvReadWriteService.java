package com.dubin.labs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class CsvReadWriteService {

    public ArrayList<Character> readCharacters(Path csvFile) throws IOException {
        ArrayList<Character> characters = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(csvFile, StandardCharsets.UTF_8)) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                characters.add(new Character(
                        Integer.parseInt(columns[0]),
                        columns[1],
                        columns[2],
                        columns[3],
                        columns[4],
                        columns[5],
                        columns[6],
                        columns[7],
                        columns[8]
                ));
            }
        }

        return characters;
    }

    public void writeCharacters(Path csvFile, ArrayList<Character> characters) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(csvFile, StandardCharsets.UTF_8)) {
            writer.write("id,name,status,species,type,gender,origin/name,location/name,created");
            writer.newLine();
            for (int i = 0; i < characters.size(); ++i) {
                Character character = characters.get(i);
                int idx = i + 1;
                writer.write(idx + "," +
                        character.getName() + "," +
                        character.getStatus() + "," +
                        character.getSpecies() + "," +
                        character.getType() + "," +
                        character.getGender() + "," +
                        character.getOriginName() + "," +
                        character.getLocationName() + "," +
                        character.getCreated());
                writer.newLine();
            }
        }
    }

}
