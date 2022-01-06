package bd.edu.rifat.bloodDonationApp.data;

import java.util.ArrayList;
import java.util.List;

public class Datagenerate {


    public static List<String> bloodGroup = new ArrayList<>();

    static {
        bloodGroup.add("A+");
        bloodGroup.add("A-");
        bloodGroup.add("O+");
        bloodGroup.add("O-");
        bloodGroup.add("AB+");
        bloodGroup.add("AB-");
        bloodGroup.add("B+");
        bloodGroup.add("B-");

    }
}
