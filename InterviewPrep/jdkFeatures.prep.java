JDK 8 features:
1. Static and default methods in interfaces for backward compatibility.


Java 9 features:
1. Private methods in interfaces.

Java 11 features:
1. Removal of Deprecated APIs: Several deprecated APIs and modules were removed, including Java EE and CORBA modules, and the Applet API.



class Singleton{

    private static Sigleton s;
    int x;
    int y;

    private Singleton(){

    }

    private Singleton(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static Singleton getSingletonObject(){
        if(s==null){
  
            s=new Singleton();
            
        }
        return s;
    }

    private void setX(int x){
        this.x = x;
    }
    private void setY(int y){
        this.y = y;
    }

   


    // If we want to set value of the singleton object we need setters
    public static setValues(int x,int y){
        if(x!=null && y!=null){
            s.setX(x);
            s.setY(y);
        }else{
            try{

                // If we do not try and catch the exception then we should propagate it with throws
                throw new Exception("Eror");
            }catch(Exception e){
                 e.printStackTrace();
            }
            
        }
       
    }



    public static setValues2(int x,int y) throws Exception{
        if(x!=null && y!=null){
            s.setX(x);
            s.setY(y);
        }else{
           
                throw new Exception("Eror");
           
            
        }
       
    }


}


// In factory design we don't want the user to use constructor directly rather objects are created by factory method


class FactoryDesign{
    private static int count;
    private static ArrayList<FactoryDesign> myList = new ArrayList<>();






    private FactoryDesign(){

    }


    public static FactoryDesign createObjects(){
        FactoryDesign fd = new FactoryDesign();
        count++;
        myList.add(fd);
        return fd;
    }

    public static ArrayList<FactoryDesign> getList(){
        return myList;
    }


    public static int getCount(){
        return count;
    }



}










/*

    Spring Security: Its for all the Authentication and Authorization needs. It is provided by the spring framework.
    It can be easily extended to meet custom requirements.

    pom.xml is the core of a project's confihuration for maven.








 */