package supportServices.Equipment_Inventory_Manager;

import java.util.List;

public class equipment {

    private String equipmentID;
    private String equipmentType;
    private String location;
    private List<repairRecord> repairRecords;

    public equipment(String equipmentID, String equipmentType, String location, List<repairRecord> repairRecords) {
        this.equipmentID = equipmentID;
        this.equipmentType = equipmentType;
        this.location = location;
        this.repairRecords = repairRecords;
    }
}