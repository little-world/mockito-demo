package services;

public class RecordService {
    DatabaseService database;

    //setters and getters

    public String save(String fileName) {
        return database.save(fileName);
    }
}
