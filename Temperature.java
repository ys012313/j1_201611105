class Temperature{
    void change(float temp,String sel){
        float q;
        if (sel.equals("'F")){
            q=(temp-32f)/1.8f;
            System.out.println(temp+sel+" changed into "+q+"'C");
        }

        else if(sel.equals("'C")){
            q=(temp*1.8f)+32;
            System.out.println(temp+sel+" changed into "+q+"'F");
        }

    }

    public static void main(String[] args){
        Temperature q=new Temperature();
        q.change(39,"'C");
        q.change(119,"'F");
    }
} 