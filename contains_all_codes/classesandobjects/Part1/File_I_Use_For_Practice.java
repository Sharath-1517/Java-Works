package classesandobjects.Part1;

public class File_I_Use_For_Practice {
    public static void main(String[] args) {

        final Students sharath = new Students("My name is sharath");
        sharath.name = "Sharath Lingam";

//        sharath = new Students("Lingam is my last name.");
//        I have commented the above line because the finalized objects attributes can be changed but the object itself can't be assigned to another instance.

    }
}


class Students{

    String name;

    Students(String name){

        this.name = name;
    }

}
