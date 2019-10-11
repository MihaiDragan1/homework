package codeAssignment;

import java.io.Serializable;

public class PackInfo implements Serializable {

    private String location;
    private int distance;
    private int value;
    private String date;

   public PackInfo(String location, Integer distance, Integer value, String date) {
        this.location = location.trim();
        this.distance = distance;
        this.value = value;
        this.date = date;

    }
    @Override
      public String toString() {
        return "\nPackInfo [Location=" + location + ", distance=" + distance + ", Value=" + value + ", date=" + date + "]";
  }

}