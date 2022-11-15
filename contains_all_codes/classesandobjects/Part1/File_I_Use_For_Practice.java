package classesandobjects.Part1;

//As file name specifies this is a file that I use only for learning purposes.

public class File_I_Use_For_Practice {
    public static void main(String[] args) {

//        final Students sharath = new Students("My name is sharath");
//        sharath.name = "Sharath Lingam";

//        sharath = new Students("Lingam is my last name.");
//        I have commented the above line because the finalized objects attributes can be changed but the object itself can't be assigned to another instance.

        Students A = new Students("new Class");

        for (int i = 0; i < 1000000000; i++) {
            A = new Students("My name");
        }

//        Lastly used this file for learning how garbage collection is worked and how finalize function is called.

    }
}


@SuppressWarnings("removal")
class Students{

    String name;

    Students(String name){

        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed.");
    }
}
