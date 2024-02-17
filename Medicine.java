package medicine;

public class Medicine {

    private String companyName;
    private String companyAddress;

    Medicine(String companyName, String companyAddress)
    {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public void displayLabel()
    {
        System.out.println("Company Details: \n"+"Company Name: "+companyName+"\nCompany Address: "+companyAddress);

    }
}

class  Tablet extends Medicine{
    private String medicineName;
    private double price;

    Tablet(String companyName, String companyAddress,String medicineName,double price) {
        super(companyName, companyAddress);
        this.medicineName = medicineName;
        this.price = price;
    }

    public void displayLabel(){
        super.displayLabel();
        System.out.println("Medicine Details :\n"+"Table name: "+medicineName+"\nprice: "+price);
    }

}

class Syrup extends Medicine{

    private String medicineName;
    private double price;

    Syrup(String companyName, String companyAddress,String medicineName,double price) {
        super(companyName, companyAddress);
        this.medicineName = medicineName;
        this.price = price;
    }

    public void displayLabel(){
        super.displayLabel();
        System.out.println("Medicine Details :\n"+"Syrup name: "+medicineName+"\nprice: "+price);
    }

}

class oilament extends Medicine{

    private String medicineName;
    private double price;

    oilament(String companyName, String companyAddress,String medicineName,double price) {
        super(companyName, companyAddress);
        this.medicineName = medicineName;
        this.price = price;
    }

    public void displayLabel(){
        super.displayLabel();
        System.out.println("Medicine Details :\n"+"oilament name: "+medicineName+"\nprice: "+price);
    }

}
