package com.example.final_project_404;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;

public class Major {
    private String name;
    private int id;
    public List<Major> majors=new ArrayList<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void loadMajor(String name){
        File file = new File("Department_"+name+".ser");
        if (!file.exists() || file.length() == 0) {
            return;
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Major major = (Major) input.readObject();
                    majors.add(major);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error in reading major: " + e.getMessage());
        }
    }


}
