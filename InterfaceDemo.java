interface RBI
{
    int TaxRate=30;
    public float CalculateIntrest();

}

class SBI implements RBI
{

    public float CalculateIntrest()
    {
        return 7.5f;
    }
}


class BOM implements RBI
{

    public float CalculateIntrest()
    {
        return 8.2f;
    }
}


class InterfaceDemo
{
    public static void main(String a[])
    {
      System.out.println("Tax Rate is::"+RBI.TaxRate);
      SBI sobj=new SBI();
       BOM bobj=new BOM();
       System.out.println("Tax Rate of SBI::"+sobj.CalculateIntrest());
       System.out.println("Tax Rate of BOM::"+bobj.CalculateIntrest());

    }
}