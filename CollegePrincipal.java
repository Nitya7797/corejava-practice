class Teacher
{
    String collegeName="";
    String designation="";
    public void work()
    {
        
    }
}
class MathTeacher
{
    String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println("Math Teacher"+"\t"+"IIT");
    }
}
class EnglishTeacher
{
    String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println("English Teacher" +"\t"+"IIT");
    }
}
class MusicTeacher
{
    String collegeName="";
    String designation="";
    public void work()
    {
        System.out.println("Music Teacher"+"\t"+"IIT");
    }
}

class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
     public static void main(String[] args)
    {
        MathTeacher m =new MathTeacher();
        m.work();
        EnglishTeacher e=new EnglishTeacher();
        e.work();
        MusicTeacher m1=new MusicTeacher();
        m1.work();
        
    }


}
