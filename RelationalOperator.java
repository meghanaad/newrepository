class RelationalOperator{

    public void greaterthan(){
        int a=10;
        int u=5;
        boolean result1= a>u;
        System.out.println(result1);
    }
    public void lessthan(){
        int a=10;
        int u=5;
        boolean result2= a<u;
        System.out.println(result2);
    }

    public void greaterthanequalto(){
        int a=10;
        int u=5;
        boolean result3= a>=u;
        System.out.println(result3);
    }
    public  void lessthanequalto(){
        int s=3;
        int r=4;
        boolean result4= s<=r;
        System.out.println(result4);
    }
    public void equalsto(){
        int a=10;
        int u=10;
        boolean result5= a==u;
        System.out.println(result5);
    }

    public void notequals(){
        int a=10;
        int u=5;
        boolean result6= a!=u;
        System.out.println(result6);
    }
    public static void main(String args[]){
        RelationalOperator r=new RelationalOperator();
        r.greaterthan();
        r.lessthan();
        r.greaterthanequalto();
        r.lessthanequalto();
        r.equalsto();
        r.notequals();


    }
}