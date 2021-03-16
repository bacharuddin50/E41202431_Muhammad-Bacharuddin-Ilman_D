package person;
class profile{
    String fName;
    String lName;
    int stuId;
    boolean stuStatus;
    
public void set(String fName, String lName, int stuId, boolean stuStatus){
    this.fName = fName;
    this.lName = lName;
    this.stuId = stuId;
    this.stuStatus = stuStatus;
}
public void show(){
    System.out.println("Student Name :"+ fName + " " + lName);
    System.out.println("Student ID   :" + stuId);
    if (stuStatus == true){
        System.out.println("Student Status : Active");
    }else{
        System.out.println("Student Status : Not Active");
    }
}
}
public class Person {
    public static void main(String[] args) {
        profile Lisa = new profile();
        Lisa.set("Lisa", "Palombo", 123456789, true);
        Lisa.show();
        // TODO code application logic here
    }
    
}
