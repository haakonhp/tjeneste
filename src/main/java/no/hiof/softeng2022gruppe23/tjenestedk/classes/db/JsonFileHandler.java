package no.hiof.softeng2022gruppe23.tjenestedk.classes.db;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.io.*;
public abstract class JsonFileHandler {

    // Converts objects to string in JSON format
    public String objectToJsonString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        return gson.toJson(this);
    }
    // Writes objects to JSON file, if the file does not exist will it be created
    // TODO     W A R N I N G !!! This method will overwrite existing file
    public void writeToJson(String path, String fileName) {
        try {
            FileWriter writer = new FileWriter(path + fileName + ".json");
            writer.write(this.objectToJsonString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Reads JSON file and returns a BufferedReader object with the file content, used in the methods that have to be implemented for each class.
    public BufferedReader readFromJson(String path) {
        try {
            return new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Converts JSON file to objects
    public <T> T jsonToObject(String path, Class<T> classOfT) {
        return new GsonBuilder().create().fromJson(readFromJson(path), (Type) classOfT);
    }

    // Deletes a JSON file
    public static void deleteJsonFile(String path) { // Made by GitHub Copilot
        File file = new File(path);
        file.delete();
    }

    /*
    Sources:
    These methods were crated by analyzing the GSON documentation and the following sources:
        https://www.javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/Gson.html
        https://github.com/google/gson/blob/master/UserGuide.md#TOC-Finer-Points-with-Objects
        https://jenkov.com/tutorials/java-json/gson.html
     */
}
