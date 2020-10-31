class Candy {
  private String name;
  //first constructor made
  Candy(){
    name ="";
  }
  //second constructor made setting the aname
  Candy (String aName) {
    name = aName;
  }
  void setName(String theName) {
    name=theName;
  }
  //accessor for the return 
  String getName(){
    return name;
  }
  //print outline statement for the names
  void print(){
    System.out.println(name);
  }
}