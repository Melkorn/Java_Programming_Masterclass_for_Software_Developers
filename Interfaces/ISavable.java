package Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface ISavable {
    void read(List<String> savedValues);
    List<String> write();
}
