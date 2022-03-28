class Teacher {
    String collegeName="IIT";
    String designation="Computer Teacher";
    public void work()
    {
        System.out.println("Computer Teacher"+"\t"+"IIT");
    }

}

class ComputerTeacher extends Teacher
{
    public static void main(String[] args)
    {
        Teacher m =new Teacher();
        m.work();
        
    }
}
