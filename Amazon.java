class Product
{
	String p_name;
	int p_id;
	double price;
	
}
class Cart
{   java.util.Scanner sc=new java.util.Scanner(System.in);
	int size=5;
	Product[] pdt=new Product[size];
	int count=0;

	public void addProduct(Product pdt)
	{   int k=count+1;
		if(k<=size)
         {  
        System.out.println("Enter product name:");
    	String p_name=sc.next();
    	System.out.println("Enter Product ID:");
    	int p_id=sc.nextInt();
    	System.out.println("Enter price:");
    	double price=sc.nextDouble();
    	System.out.println("Product inserted");
    	    this.pdt[count]=pdt;
         	this.pdt[count].p_name=p_name;
         	this.pdt[count].p_id=p_id;
         	this.pdt[count].price=price;
         	count++;
         }
         else
         	System.out.println("Cart Full");
	}
	public void removeProduct()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
    if(count!=0)
    {
    	System.out.println("Enter the obj to be removed");
    	int obj=sc.nextInt();
        int k=obj-1;
    if(k<size && this.pdt[k]!=null)
    {
    	this.pdt[k]=null;
    	for(int i=k;i<count-1;i++)
    	{
            pdt[i]=pdt[i+1];
    	}
    	pdt[count-1]=null;
    	System.out.println("Product removed Successfully");
    	count-=1;
    }
    else 
    	System.out.println("Obj does not exists");
    }
	}
	public void displayProd()
	{	System.out.println("---------------------------");
		for(int i=0;i<count;i++)
		{
		System.out.println("Product "+(i+1));
		System.out.println(pdt[i].p_name);
		System.out.println(pdt[i].p_id);
		System.out.println(pdt[i].price);
		}

		System.out.println("---------------------------");
	/*	System.out.println("Enter the obj to be displayed:");
	    int ob=sc.nextInt();
	    int m=ob-1;
	   if(pdt[m]!=null)
	   {
		System.out.println(pdt[m].p_name);
		System.out.println(pdt[m].p_id);
		System.out.println(pdt[m].price);
	}
	else 
		System.out.println("Object is Empty");  */

	}
	public void checkCart()
	{
     if(pdt==null)
     {
     	System.out.println("Cart Empty");
     }
     else
     	System.out.println("No of Items in cart : "+count);
	}
}


class Amazon
{public static void main(String[] args) {
java.util.Scanner sc=new java.util.Scanner(System.in);
 
	Cart c=new Cart();
	   
	boolean b=true;
	while(b)
	{
	   System.out.println("1.AddProd\n2.RemoveProd\n3.Check Cart\n4.displayProd\n5.Exit");
	   System.out.println("Enter choice:");
	   int ch=sc.nextInt();

    switch(ch)
    {
    case 1:
    {   
    	c.addProduct(new Product());
    	
    	break;
    }
    case 2:
	{
		c.removeProduct();
		break;
	}
	case 3:
	{
		c.checkCart();
		break;
	}
case 4:
	{
		c.displayProd();
		break;
	}
    case 5:
    	{
        b=false;
    	}
	}
}

}

}