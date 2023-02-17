class Assignment{
    public void add(){
        int result=23;
        result+=10;
         System.out.println(result);
   }
    public void  subtraction(){
       int sub=15;
        sub-=5;
           System.out.println(sub);
    }
    public void multiply(){
       int mul=10;
        mul*=5;
           System.out.println(mul);
    }
    public static void main(String args[]){
        Assignment a=new Assignment();
        a.add();
        a.subtraction();
        a.multiply();
       
     
     
    }
}