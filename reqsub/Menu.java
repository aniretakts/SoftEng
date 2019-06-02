import java.util.*;
public class Menu
{
    int k=5;
    int z=10;
    int ff;//id aithmatos
    int w;//id xrhsth
    Scanner sc = new Scanner(System.in);
    public void menuu()
    {
        Aithma yolo = new Aithma();
        Xrhsths loyo=new Xrhsths();
        while(z!=0){
         System.out.println("αν θέλετε να κάνετε register πατήστε 1");
         System.out.println("αν θέλετε να κάνετε login πατήστε 2");
         System.out.println("αν θέλετε να κλείσετε το πρόγραμμα πατήστε 3");
         z= sc.nextInt();
         if(z==1){
          loyo.register();
          k=100;
         }
         else if(z==2){ 
          if(loyo.xrhstes.size()!=0){   
          w=loyo.login();
          if(w!=-1)
            k=100;
         }
         else{System.out.println("δεν υπάρχουν χρήστες στο σύστημα");}
         }
         else z=0;
         while(k!=5){
          System.out.println("αν θέλετε να κάνετε submit request πατήστε 1");
          System.out.println("αν θέλετε να κάνετε request claim πατήστε 2");
          System.out.println("αν θέλετε να κάνετε προβολή των request που έχετε ζητήσει να αναλάβετε πατήστε 3");
          System.out.println("αν θέλετε να κάνετε προβολή των request που έχετε δημιουργήσει πατήστε 4");
          System.out.println("αν θέλετε να κάνετε logout πατήστε 5");
          k= sc.nextInt();
          sc.nextLine(); 
          if(k==1)
          yolo.requestsub(w);
          else if(k==2){
             ff=yolo.choosereq();
             if (ff!=-1)
              yolo.requestclaim(w,ff);
           }
          else if(k==3){
           if(loyo.xrhstes.get(w).pendingreq.size()!=0)   
            yolo.pendinglistrequestee(0);
            else
             System.out.println("δεν έχετε αναλάβει requests");
           } 
          else if(k==4)
          yolo.pendinglistrequester(w);
        }
      }
   }
}
