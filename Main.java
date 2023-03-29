class Test { 
    private int age; 
    private String name; 
    public void setAge(int age) { 
     this.age = age; 
    } 
     public void setName(String name) { 
     this.name = name; 
    } 
     public int getAge() { 
     return this.age; 
    } 
    public String getName() { 
     return this.name; 
    } 
  } 
  class Main { 
    public static void main(String[] args) { 
      Test test = new Test(); 
      test.setAge(19); 
      test.setName("Arman"); 
      System.out.println("Age: " + test.getAge()); 
      System.out.println("Name: " + test.getName()); 
  } 
} 