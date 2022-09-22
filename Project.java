import java.util.Date;

public class Project {

    // Attributes
    int projectNumber;
    String projectName;
    String buildingType;
    String physicalAddress;
    int erfNumber;
    Double totalFee;
    Double amountPaid;
    String deadline;
    Person Architect;
    Person Customer;
    Person Contractor;

    // Creating constructor

    public Project(int projectNumber, String projectName, String buildingType, String physicalAddress, int erfNumber, Double totalFee,
                   Double amountPaid, String deadline,Person Architect, Person Customer, Person Contractor) {

        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.Architect = Architect;
        this.Customer = Customer;
        this.Contractor = Contractor;
    }

    // Getters and Setters
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setDeadline (String deadline) {
        this.deadline = deadline;
    }
    public void setAmountPaid (Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    // toString method
    public String toString() {
        String output = "";
        output += "\nProject Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nPhysical Address: " + physicalAddress;
        output += "\nErf Number: " + erfNumber;
        output += "\nTotal Fee: " + totalFee;
        output += "\nAmount Paid: " + amountPaid;
        output += "\nDeadline: " + deadline;
        output += "\n";
        output += "\nArchitect Details: " + Architect;
        output += "\n";
        output += "\nCustomer Details: " + Customer;
        output += "\n";
        output += "\nContractor Details: " + Contractor;

        return output;
    }

}