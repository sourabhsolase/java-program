//abstract class is class which contains 0 or more abstract method in it
abstract class arithmatic
{
    public int addtion(int no1,int no2)
    {
        return no1+no2;
    }
    public abstract int substraction (int no1,int no2);
    
}
class marvellous extends arithematic
{
    public int substraction (int no1,int no2)
    {
        return no1-no2;
    }
}

class abstractdemo
{
    public static void main(String arr[])
    {
      marvellous mobj =new marvellous();

      int iret =0;
      iret= mobj

    }
}