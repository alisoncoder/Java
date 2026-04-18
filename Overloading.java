class Student
{
    int id;
    String name;
    float stipend;

    Student(){}

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void displayDetails(){
        System.out.println(this.id + " | " + this.name + " | " + this.stipend);
    }
}


class Overloading {
    public static void main(String[] args)
{
    Student stl=new Student();
    Student st2=new Student(45,"Nicole");
    Student st3=new Student(38,"Henry",10000);

    stl.displayDetails();
    st2.displayDetails();
    st3.displayDetails();
}
}
