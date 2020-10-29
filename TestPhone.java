class Phone{
   String phoneNumber = "0717798942";
    
    void setNumber(){
        String phoneNumber;
        phoneNumber = "0713425355";
       }

    }

class TestPhone{
    public static void main(String[] args){
      
       Phone p1 = new Phone();
       p1.setNumber();
       System.out.println(p1.phoneNumber);
      }
  } 

