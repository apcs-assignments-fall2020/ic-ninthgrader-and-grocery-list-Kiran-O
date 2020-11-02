public class NinthGrader extends Student{
    public NinthGrader(String a, String b){
        super(a,b,2024);
    }
    public NinthGrader(){
        super("Brad","King",2024);
    }
    public void doSomething(){
        System.out.println(this.getFirstName() + "I am studying");
    }
    public String toString(){
        return (this.getFirstName() + this.getLastName() + "," + 2024 + "(Ninth Grade)");
    }


    
}