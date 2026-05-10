class Wonders{  
  void location(){
    System.out.println("Location is:");
  }  
  void famousfor(){
    System.out.println("Famous for:");
  }  
 
}  

class Colosseum extends Wonders {  
  void location(){
    System.out.println("Colosseum is located in Rome");
  }  
void famousfor(){
    System.out.println("It is Famous for hosting gladiator contests");
  }  
}


class Petra extends Wonders {  
  void location(){
    System.out.println("Petra is between the Red Sea and the Dead sea");
  }  
  void famousfor(){
    System.out.println("It is Famous for its rock-cut architecture");
  }  
}


class Pyramids extends Wonders {  
  void location(){
    System.out.println("Pyramids are located in Egypt");
  }  
  void famousfor(){
    System.out.println("It is Famous for its shape");
  }  
}


class Polymorphism2 {
  public static void main(String args[]){
    Wonders A = new Wonders();
    Wonders C = new Colosseum();
 
    Wonders P = new Petra();
 
    Wonders Py = new Pyramids();
 
    A.location();
  A.famousfor();
 
  C.location();
  C.famousfor();
 
  P.location();
  P.famousfor();
 
  Py.location();
  Py.famousfor();
  }  
}  
