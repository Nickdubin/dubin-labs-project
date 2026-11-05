package com.dubin.labs;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    static void main() throws IOException, URISyntaxException {
        Path csvInputFile = Path.of(Objects.requireNonNull(Main.class.getResource("/characters.csv")).toURI());
        Path csvOutputFile = Path.of("characters_sorted_by_name.csv");

        CsvReadWriteService service = new CsvReadWriteService();
        ArrayList<Character> characters = service.readCharacters(csvInputFile);

        characters.sort(new CharacterComparator());

        service.writeCharacters(csvOutputFile, characters);

        System.out.println("Characters sorted by name were written to " + csvOutputFile.toAbsolutePath());
    }

}
