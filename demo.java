class maths
{
    public int iNo1;   //characteristics
    public int iNo2;     //characteristics

    public maths()   //defult constructor
    {
     System.out.println("inside defult constructor");
    }

    public maths(int a, int b) //parametrised constructor
    {
        System.out.println("inside parametrised constructor");
        iNo1=a;
        iNo2=b;
    }
    public int addition()      //behaviour
    {
        int iAns=0;
        iAns=iNo1+iNo2;
        return iAns;
    }
    public int substraction()    //behaviour
    {
         int iAns=0;
        iAns=iNo1-iNo2;
        return iAns;
    }
    
}//end of maths class



class demo
{
    public static void main(String arr[])
    {
            System.out.println("inside main function");
            maths mobj1=new maths();
            maths mobj2=new maths(10,11);
            
            int iRet=0;
            iRet=mobj1.addition();
            System.out.println("addition is :"+iRet);

            iRet=mobj2.addition();
            System.out.println("adddition is:"+iRet);
    
    
    }
}
