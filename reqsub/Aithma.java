import java.util.*;
public class Aithma
{
    int type;//purchase and delivery h service
    int requestid;//noumero aithmatos
    String proion;//to kati pou thelei 
    String toposparadoshs;//topos paradoshs
    int xronosparadoshs;//xronos paradoshs
    String afethria;
    String eksuphrethsh;
    String uphresia;
    String katasthma;
    int userid;
    double amoivh;
    double aksiologhshrequester;
    String input;
    int j;
    int p=0;
    int stateflag =0;
    static int counter=0;
    boolean boolpro;//boolean gia thn while sta proionta
    ArrayList<Proion> proionta = new ArrayList<Proion>();
    static ArrayList<String> katasthmata = new ArrayList<String>();
    ArrayList<Aithma> aithmata = new ArrayList<Aithma>();
    Xrhsths enas = new Xrhsths();
    public Aithma(){}
    public Aithma(int typee,ArrayList proions,String toposparadoshss,int xronosparadoshss,int js,int userids,int stateflags,double amoivhs)
    {
        amoivh=amoivhs;
        requestid=counter;
        type=typee;
        proionta=proions;
        toposparadoshs=toposparadoshss;
        xronosparadoshs=xronosparadoshss;
        j=js;
        userid=userids;
        stateflag=stateflags;
    }
    public Aithma(int typee,String afethrias,String eksuphrethshs,String uphresias,String toposparadoshss,int xronosparadoshss,int js,int userids,int stateflags,double amoivhs){
         amoivh=amoivhs;
         requestid=counter; 
         type=typee; 
         afethria=afethrias; 
         eksuphrethsh=eksuphrethshs;
         uphresia=uphresias; 
         toposparadoshs=toposparadoshss;
         xronosparadoshs=xronosparadoshss;
         j=js;
         userid=userids;
         stateflag=stateflags;
    }
    
    public void requestsub(int x)
    {
          if(enas.validuser(x)){
             userid=x;
             Scanner sc = new Scanner(System.in);
             int i=4;
            while (i!=1 & i!=2){
             System.out.println("Αν θέλετε να χρησιμοποιήσετε την υπηρεσία “Αγορά και παράδοση” πατήστε 1 αλλιώς αν θέλετε να χρησιμοποιήσετε την υπηρεσία “Εξυπηρέτηση” πατήστε 2 ");
             i= sc.nextInt();
             sc.nextLine(); 
            }
            if (i==1){
               boolpro=false;
               while (boolpro==false){
               System.out.println("Παρακαλώ εισάγετε περιγραφή του προϊόντος που επιθυμείτε");
               proion = sc. nextLine();
               System.out.println("Διαλέξτε κατάστημα από την λίστα ή προσθέστε καινούριο");
                for (p = 0; p < katasthmata.size(); p++) {
                        System.out.println("Για να επιλέξετε το κατάστημα "+katasthmata.get(p)+" πατήστε "+p);
                           }
               System.out.println("Για να προσθέσετε καινούριο κατάστημα πατήστε "+p);
               j = sc.nextInt();
               sc.nextLine(); 
               if(j<p){
                 katasthma=katasthmata.get(j);
                }
               else{
                System.out.println("Εισάγετε το όνομα του καταστήματος που θέλετε να σας εξυπηρετήσει");
                katasthma=sc. nextLine();
                katasthmata.add(katasthma);
                }
                proionta.add(new Proion(katasthma,proion)); 
                katasthma="otinanai";
                while(!(katasthma.equals("ΟΧΙ")) & (!(katasthma.equals("OXI"))) & (!(katasthma.equals("NAI")) & (!(katasthma.equals("ΝΑΙ"))) & (!(katasthma.equals("oxi"))) & (!(katasthma.equals("όχι"))) & (!(katasthma.equals("ναι"))) & (!(katasthma.equals("nai")))))
                {
                 System.out.println("Θέλετε και άλλα προϊόντα; Πατήστε ΝΑΙ για να εισάγετε και άλλο προϊόν ή ΟΧΙ για να συνεχίσετε");
                 katasthma=sc. nextLine();
                }
                if (katasthma.equals("ΟΧΙ") || katasthma.equals("OXI") || katasthma.equals("oxi") || katasthma.equals("όχι"))
                { boolpro=true;
                 }
             } 
            }
            else{
               System.out.println("Παρακαλώ εισάγετε την διεύθυνση αφετηρίας του αιτήματος");
               afethria = sc. nextLine();
               System.out.println("Παρακαλώ εισάγετε την διεύθυνση εξυπηρέτησης του αιτήματος");
               eksuphrethsh = sc. nextLine();
               System.out.println("Παρακαλώ εισάγετε την/τις υπηρεσία/σίες που επιθυμείτε");
               uphresia = sc. nextLine();
            }
            System.out.println("Παρακαλώ εισάγετε τον τόπο παράδωσης");
            toposparadoshs = sc. nextLine();
            System.out.println("Παρακαλώ εισάγετε τον χρονο παράδωσης σε λεπτά");
            xronosparadoshs = sc. nextInt();
            j=0;
            while(j!=1 & j!=2){
             System.out.println("Αν θέλετε να δημοσιεύσετε το αίτημα σε όλους τους χρήστες πατήστε 1 αλλιώς αν θέλετε να το δημοσιεύσετε μόνο σε prenium χρήστες πατήστε 2 ");
             j = sc.nextInt();
            }
            System.out.println("Εισάγετε την προσφερόμενη αμοιβή");
            amoivh=sc.nextDouble();
             if (i==1){
                aithmata.add(new Aithma (i,proionta,toposparadoshs,xronosparadoshs,j,userid,0,amoivh));
                counter++;
             }
             else{
                aithmata.add(new Aithma(i,afethria,eksuphrethsh,uphresia,toposparadoshs,xronosparadoshs,j,userid,0,amoivh));
                counter++;
             }
            
        }
        else{ System.out.println("Ο λογαριασμός δεν είναι έγκυρος");}
    }
   public void pendinglistrequestee(int x){
        boolean br=false;
        int j=0;
        do{
         int i=0,k=0; 
        
         String input;
         for(i=0;i<aithmata.size();i++){
              if(aithmata.get(i).stateflag==1){ //& requestee.get(x).request==aithmata.get(x).requestid)
                 System.out.println(i + ". " + aithmata.get(i).requestid +"\n");
               }
            }
         System.out.println("Παρακαλώ διαλλέξτε ένα αίτημα");
         Scanner sc = new Scanner(System.in);
         k = sc.nextInt();
         j=3;
         while(j!=1 & j!=2 & j!=0){
           System.out.println("Πατήστε 1 για Προβολή αιτήματος ή πατήστε 2 για Άρση διεκδίκησης ή 0 για Έξοδο");
              j=sc.nextInt();
             }
         if(j==1){requestsummary(k);}
         else if (j==2){
                  input="tralala";
                  Scanner ss = new Scanner(System.in);
                  while(!(input.equals("ΟΧΙ")) & (!(input.equals("OXI"))) & (!(input.equals("NAI")) & (!(input.equals("ΝΑΙ"))) & (!(input.equals("oxi"))) & (!(input.equals("όχι"))) & (!(input.equals("ναι"))) & (!(input.equals("nai")))))
              {
                  System.out.println("Άρση διεκδίκησης:θέλετε να συνεχίσετε?");
                  System.out.println("NAI ή OXI?");
                  input=ss. nextLine();
                }
              if (input.equals("YES"))
                { aithmata.get(k).stateflag=0;//antistoixh allagh sth klassh requestee
                  System.out.println("Η Άρση διεκδίκησης ολοκληρώθηκε");
                }
                
                else {                 
                    System.out.println("Η Άρση διεκδίκησης ακυρώθηκε");
              }
                 
           }
                     
       }while(j==0);
       //public void requestsub2(){System.out.println(aithmata.get(0).toposparadoshs);}
  }
      public void requestclaim(int usersid,int reqid){
        int x=usersid;
        int y=reqid;
        System.out.println("Αίτημα με αριθμό "+ y +"του χρήστη "+ x +"\n"+"επιλέξτε 1 για Προβολή αιτήματος ή  2 για Διεκδίκηση αιτήματος");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        sc.nextLine(); 
        if (i==1){
            requestsummary(y);
        }
        else if(i==2){
            boolean validbank=enas.hasbankacc(x);
            if (validbank==false){enas.createbankacc(x);}
            else{
                 String ok="tralalo";
                 while(!(ok.equals("ΟΧΙ")) & (!(ok.equals("OXI"))) & (!(ok.equals("NAI")) & (!(ok.equals("ΝΑΙ"))) & (!(ok.equals("oxi"))) & (!(ok.equals("όχι"))) & (!(ok.equals("ναι"))) & (!(ok.equals("nai")))))
                  {
                  System.out.println("Είστε σίγουρος ότι θέλετε να αναλάβετε το αίτημα? NAI/OXI");
                  ok=sc.nextLine();
                  }
                 if(ok.equals("OXI")){System.out.println("Ανάληψη αιτήματος ακυρώθηκε");}
                 else if(ok.equals("NAI")){
                     aithmata.get(y).stateflag=1;
                     enas.claimthis(x,y);
                     System.out.println("User με id "+ x +"ένας χρήστης μόλις διεκδήκησε το αίτημα σας με id " +y);
                    }
            }
         }
      }
  
  public void requestsummary(int x)
    {
        int i=0;
       if(aithmata.get(x).type==1){
        //X�?ηστης enas = new X�?ηστης();
        System.out.println(" ID requester:"+aithmata.get(x).userid +"\n");
        for(i=0;i<proionta.size();i++){
        System.out.println("Προιόν:"+proionta.get(i).perigrafh + " Κατάστημα:"+proionta.get(i).katasthma +"\n");
        }
        System.out.println("Τροπος παράδοσης:"+aithmata.get(x).toposparadoshs +"\n"+"Χρονος παράδοσης:"+aithmata.get(x).xronosparadoshs +"\n"+"Προσφερομενη αμοιβή:"+aithmata.get(x).amoivh);
        //askiloghsh requester       
        Scanner sc = new Scanner(System.in);
        int z=3;
        while(z!=1 & z!=2 & z!=-1){
           System.out.println("Πατήστε 1 για  Προφίλ requester ή 2 για Προβολή στο χάρτη ή -1 για έξοδο");
           z=sc.nextInt();
         }
        if(z==1){ 
            enas.viewrequesterprofile(aithmata.get(x).userid);
                     }
         else if(z==2) {System.out.println("google maps");
                }
      }
       else if(aithmata.get(x).type==2){
        System.out.println(" ID requester:"+aithmata.get(x).userid);
        System.out.println("Διεύθυνση αφετηρίας:"+aithmata.get(x).afethria +"\n" +" Διεύθυνση εξυπηρέτησης:"+aithmata.get(x).eksuphrethsh);
        System.out.println("Υπηρεσία/ίες:"+aithmata.get(x).uphresia +"\n"+ "Τροπος παράδοσης:"+aithmata.get(x).toposparadoshs +"\n"+"Χρονος παράδοσης:"+aithmata.get(x).xronosparadoshs +"\n"+"Προσφερομενη αμοιβή:"+aithmata.get(x).amoivh);
        //askiloghsh requester  
        Scanner sc = new Scanner(System.in);
        int z=3;
        while(z!=1 & z!=2 & z!=-1){
           System.out.println("Πατήστε 1 για  Προφίλ requester ή 2 για Προβολή στο χάρτηή -1 για έξοδο");
           z=sc.nextInt();
         }
        if(z==1){ 
              enas.viewrequesterprofile(aithmata.get(x).userid);
                  }
          else if(z==2){System.out.println("google maps");
                }
            }
    }
    public void requestdelete(int x){
        aithmata.remove(x);
    }
    public void settoposparadoshs(int x){
     Scanner sc = new Scanner(System.in);
     String input;
     System.out.println("Εισάγετε τον νέο τόπο παράδοσης");
     input=sc.nextLine();
     aithmata.get(x).toposparadoshs=input;
    } 
    public void setafethria(int x){
     Scanner sc = new Scanner(System.in);
     String input;
     System.out.println("Εισάγετε τη νέα αφετηρία");
     input=sc.nextLine();
     aithmata.get(x).afethria=input;
    }
    public void setuphresia(int x){
     Scanner sc = new Scanner(System.in);
     String input;
     System.out.println("Εισάγετε τη νέα υπηρεσία");
     input=sc.nextLine();
     aithmata.get(x).uphresia=input;
    }
   public void seteksuphrethsh(int x){
     Scanner sc = new Scanner(System.in);
     String input;
     System.out.println("Εισάγετε τη νέα διεύθυνση εξυπηρέτησης");
     input=sc.nextLine();
     aithmata.get(x).eksuphrethsh=input;
     }        
   public void setxronosparadoshs(int x){
     Scanner sc = new Scanner(System.in);
     int input;
     System.out.println("Εισάγετε τo νέo χρόνο παράδοσης");
     input=sc.nextInt();
     aithmata.get(x).xronosparadoshs=input;
     }
   public void setamoivh(int x){
     Scanner sc = new Scanner(System.in);
     double input;
     System.out.println("Εισάγετε την νέα προσφερόμενη αμοιβή");
     input=sc.nextDouble();
     aithmata.get(x).amoivh=input;
     }
    public void setproion(int x,int y){//x=idaithmatos kai y=idproin
     int w=0;
     Scanner sc = new Scanner(System.in);
     while (w!=1 & w!=2){
             System.out.println("Αν θέλετε να αλλάξετε το προϊόν πατήστε 1 αλλιώς αν θέλετε να αλλάξετε το κατάστημα πατήστε 2 ");
             w= sc.nextInt();
            }
     if (w==2){
        for (p = 0; p < katasthmata.size(); p++) {
                        System.out.println("Για να επιλέξετε το κατάστημα "+katasthmata.get(p)+" πατήστε "+p);
                           }
        System.out.println("Για να προσθέσετε καινούριο κατάστημα πατήστε "+p);
        j = sc.nextInt();
        sc.nextLine(); 
        if(j<p){
             katasthma=katasthmata.get(j);
                }
        else{
             System.out.println("Εισάγετε το όνομα του καταστήματος που θέλετε να σας εξυπηρετήσει");
             katasthma=sc. nextLine();
             katasthmata.add(katasthma);
                }
        aithmata.get(x).proionta.get(y).katasthma=katasthma;
        }    
      else{
        aithmata.get(x).proionta.remove(y);
        sc. nextLine();
        System.out.println("Παρακαλώ εισάγετε περιγραφή του προϊόντος που επιθυμείτε");
        proion = sc. nextLine();
        System.out.println("Διαλλέξτε κατάστημα από την λίστα ή προσθέστε καινούριο");
        for (p = 0; p < katasthmata.size(); p++) {
                System.out.println("Για να επιλέξετε το κατάστημα "+katasthmata.get(p)+" πατήστε "+p);
              }
        System.out.println("Για να προσθέσετε καινούριο κατάστημα πατήστε "+p);
        j = sc.nextInt();
        sc.nextLine(); 
        if(j<p){
            katasthma=katasthmata.get(j);
             }
        else{
            System.out.println("Εισάγετε το όνομα του καταστήματος που θέλετε να σας εξυπηρετήσει");
            katasthma=sc. nextLine();
             katasthmata.add(katasthma);
            }
        proionta.add(new Proion(katasthma,proion));
        }
    }
    public int choosereq(){
         Scanner sc = new Scanner(System.in);
         for (int j = 0; j < aithmata.size(); j++) {
            System.out.println("Αν θέλετε να αναλάβετε το παρακάτω αίτημα πατήστε "+j);
            requestsummary(j);
         }
          if(aithmata.size()>0){
           System.out.println("Αν δεν θέλετε να αναλάβετε κάποιο αίτημα πατήστε "+ j);
           int g = sc.nextInt();
           if(g<(aithmata.size())) return g;
           else return -1;
         }
         else {
             System.out.println("Δεν υπάρχουν διαθέσιμα αιτήματα");
             return -1;
            }
    }
    public void pendinglistrequester(int x){
        boolean br=false;
        do{
         int i=0,j=0,k=0; 
         String input;
         
         for (i=0;i<aithmata.size();i++){
             if(aithmata.get(i).userid==x){System.out.println("id αιτήματος: "+aithmata.get(i).requestid);}
            }
         
         Scanner sc = new Scanner(System.in);    
         
         
         System.out.println("Διαλλέξτε ένα αίτημα πληκτρολογώντας το id του ή πληκτρολογήστε -1 για έξοδο");
         x=sc.nextInt();
         if(x==-1){br=true;}
         else{
        System.out.println("Πατήστε 1 για Επεξεργασία αιτήματος, 2 για Προβολή αιτήματος, 3 για Διαγραφή αιτηματος, 4 για Προβολή διεκδικήσεων αιτήματος και 0 για έξοδο");

        j=sc.nextInt();
        if(j==2){requestsummary(aithmata.get(x).requestid);}
        else if(j==1){
         if(aithmata.get(x).type==1){//----------------------------------------PROION----------------------------------------------
         System.out.println("ID requester:"+aithmata.get(x).userid +"\n");
        for(i=0;i<aithmata.get(x).proionta.size();i++){//na ginei allagh kai sta upoloipa me aithmata.get(x).
        System.out.println(i+ "Προιόν:"+aithmata.get(x).proionta.get(i).perigrafh + " Κατάστημα:"+aithmata.get(x).proionta.get(i).katasthma);
        }
        System.out.println((i+1)+"Τροπος παράδοσης:"+aithmata.get(x).toposparadoshs +"\n"+ (i+2) +"Χρονος παράδοσης:"+aithmata.get(x).xronosparadoshs +"\n"+ (i+3)+"Προσφερομενη αμοιβή:"+aithmata.get(x).amoivh);
               
        
        int z=10;
        if(j==1)
        while(z!=-1){
           System.out.println("Παρακαλώ επιλλέξτε το πεδίο που θέλετε να επεξεργαστείτε");
           System.out.println("Πατήστε -1 για έξοδο");
           z=sc.nextInt();
           if (z<=i){setproion(aithmata.get(x).requestid,i);}
           else if(z==i+1){settoposparadoshs(aithmata.get(x).requestid);}
           else if(z==i+2){setxronosparadoshs(aithmata.get(x).requestid);}
           else if(z==i+3){setamoivh(aithmata.get(x).requestid);}
         }
      }
        else if(aithmata.get(x).type==2){//-----------------------------------------YPHRESIA---------------------------------------------------
        System.out.println(" ID requester:"+aithmata.get(x).userid);
        System.out.println("1.Διεύθυνση αφετηρίας:"+aithmata.get(x).afethria +"\n" +" 2.Διεύθυνση εξυπηρέτησης:"+aithmata.get(x).eksuphrethsh);
        System.out.println("3.Υπηρεσία/ίες:"+aithmata.get(x).uphresia +"\n"+"4.Χρονος παράδοσης:"+aithmata.get(x).xronosparadoshs +"\n"+"5.Προσφερομενη αμοιβή:"+aithmata.get(x).amoivh);
        
        int z=10;
        while(z!=-1 ){
           System.out.println("Παρακαλώ επιλλέξτε το πεδίο που θέλετε να επεξεργαστείτε");
           System.out.println("Πατήστε -1 για έξοδο");
           z=sc.nextInt();
           if(z==1){setafethria(aithmata.get(x).requestid);}
           else if(z==2){seteksuphrethsh(aithmata.get(x).requestid);}
           else if(z==3){setuphresia(aithmata.get(x).requestid);}
           else if(z==4){setxronosparadoshs(aithmata.get(x).requestid);}
           else if(z==5){setamoivh(aithmata.get(x).requestid);}
         }
        
            }
      
        }
        else if (j==3){requestdelete(aithmata.get(x).requestid);
         System.out.println("Το αίτημα διαγράφτηκε");
        }
        else if (j==4){
         for (i=0;i<aithmata.size();i++){
            for (j=0;j<Xrhsths.xrhstes.size();j++){
                for(k=0;k<Xrhsths.xrhstes.get(j).pendingreq.size();k++){
                 if(Xrhsths.xrhstes.get(j).pendingreq.get(k)==aithmata.get(x).requestid){
                System.out.println(Xrhsths.xrhstes.get(j).userid);
            }
            }
        }
            }
                        System.out.println("Διαλέξτε έναν requestee για να μεταφερθείτε στο Request claim acceptance");

        }
    }
      }while(br!=true);
       
  }
}
