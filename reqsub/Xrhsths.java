
/**
 * Write a description of class χρηστης here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Xrhsths
{
    int userid;
    static ArrayList<Xrhsths> xrhstes = new ArrayList<Xrhsths>();
    static int counter=0;
    ArrayList<Integer> pendingreq = new ArrayList<Integer>();
    String onoma;
    String phonenumber;
    String address;
    int code;
    Scanner sc = new Scanner(System.in);
    /**
     * Constructor for objects of class χρηστης
     */
    public Xrhsths()
    {
    }
    public Xrhsths(String onomaa,String phonenumbers,String add,int cod)
    {
        userid=counter;
        counter++;
        onoma=onomaa;
        phonenumber=phonenumbers;
        address=add;
        code=cod;
    }
    public  void register(){
       System.out.println("παρακαλώ εισάγετε τον όνομα σας");
       String on= sc.nextLine();
       System.out.println("παρακαλώ εισάγετε το τηλέφωνό σας");
       String hls= sc.nextLine();
       System.out.println("παρακαλώ εισάγετε την διεύθυνση σας");
       String add= sc.nextLine();
       System.out.println("παρακαλώ εισάγετε τον κωδικό σας");
       int cod= sc.nextInt();
       xrhstes.add(new Xrhsths(on,hls,add,cod));
    }
    public boolean validuser(int x)
    {
        System.out.println("παρακαλώ εισάγετε τον κωδικό σας");
        int i = sc.nextInt();
        if(i==xrhstes.get(x).code)
        return true;
        else 
        return false;
    }
    public boolean hasbankacc(int x){
         System.out.println("αν θέλετε να έχει bank account πατήστε 1 αλλιώς 2 ");;
         int i = sc.nextInt();
         if (i==1) {return true;}
         else {return false ;}
    }
    public void createbankacc(int x){
       System.out.println("ok eftiakse");
    }
    public void claimthis(int x ,int y){//x=id xrhsth kai y=id aithmatos
        xrhstes.get(x).pendingreq.add(y);
    }
    public int login(){
         sc.nextLine();
         System.out.println("παρακαλώ εισάγετε τον όνομα σας");
         String on= sc.nextLine();
         int g=1;
         boolean vrethike=false;
         for (int i = 0; i < xrhstes.size(); i++) {
            if (on.equals(xrhstes.get(i).onoma)){
              vrethike=true;
               while(g==1) {
                 System.out.println("παρακαλώ εισάγετε τον κωδικό σας");
                 int c = sc.nextInt();
                 if(c==(xrhstes.get(i).code)){
                    return xrhstes.get(i).userid;
                 }
                 else{
                    System.out.println("λάθος κωδικός.Για να ξαναδοκιμάσετε πατήστε 1 αλλιώς 2 για να πάτε πίσω");
                    g = sc.nextInt();
                 }
              }
            }
         }
         if (!vrethike){System.out.println("δεν υπάρχει χρήστης με αυτό το όνομα");}
         return -1;
       }
    public void viewrequesterprofile(int x){
         System.out.println("o requester με όνομα:"+xrhstes.get(x).onoma+" τηλέφωνο:"+xrhstes.get(x).phonenumber+" και διεύθυνση:"+xrhstes.get(x).address);
    }    
}
