package supportServices.Equipment_Inventory_Manager;

public class repairRecord {

    private String repairID;
    private String technicianID;
    private String date;
    private String description;
    private List<part> partsUsed; 

    public repairRecord(String repairID, String technicianID, String date, String description, List<part> partsUsed) {
        this.repairID = repairID;
        this.technicianID = technicianID;
        this.date = date;
        this.description = description;
        this.partsUsed = partsUsed;
    }
}