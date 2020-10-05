class ArmstrongExample{  

  public static void main(String[] args)  {  

    int c=0,a,temp;  

    int n=245;//This number is to check armstrong  

    temp=n;  

    while(n>0)  

    {  

    a=n%10;  

    n=n/10;  

    c=c+(a*a*a);  

    }  

    if(temp==c)  
    {
        System.out.println("It is a armstrong number");   
    }
    else  
    {
        System.out.println("It is a Not armstrong number");   
    }
   }  

}  
