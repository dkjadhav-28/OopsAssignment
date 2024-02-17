package medicine;

public class MedicineUI {

    public static void main(String[] args) {
        Medicine medicine; //referenc eof medicine created
        //tablet object created
        medicine = new Tablet("Cipla","Navi Mumbai","Gelocil",20.2);
        medicine.displayLabel();

        System.out.println("\n");

        //reference of Medicine act as Syrup class object;
        medicine = new Syrup("ManKind","Hadapsur| Pune","Sucrafil",181.34);
        medicine.displayLabel();

        System.out.println("\n");

        //reference of Medicine act as Oilament class object;
        medicine = new oilament("SunPharma","Goa","Kailash Jeevan",133.45);
        medicine.displayLabel();


    }
}
