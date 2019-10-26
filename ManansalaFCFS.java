
package manansala.fcfs;
import java.io.*; 

public class ManansalaFCFS {

   
    public static void main(String[] args) throws IOException {
     int n,AT[],BT[],WT[],TAT[]; 
     
int TWT=0;
int ToT=0;
float AWT=0;
float ATAT=0;
InputStreamReader isr=new InputStreamReader(System.in); 
BufferedReader br=new BufferedReader(isr); 
System.out.println("Enter no of process"); 
n=Integer.parseInt(br.readLine()); 
BT=new int[n]; 
WT=new int[n]; 
TAT=new int[n]; 
AT=new int[n]; 
System.out.println("Enter Burst time for each process\n----------------------------------"); 
for(int i=0;i<n;i++) 
{ 
System.out.println("Enter BT for process " +(i+1)); 
BT[i]=Integer.parseInt(br.readLine()); 
} 
System.out.println("----------------------------------"); 
for(int i=0;i<n;i++) 
{ 
System.out.println("Enter AT for process" +(i+1)); 
AT[i]=Integer.parseInt(br.readLine()); 
} 
System.out.println("----------------------------------"); 
WT[0]=0;
for(int i=1;i<n;i++) 
{ 
WT[i]=WT[i-1]+BT[i-1]+AT[i-1]; 
WT[i]=WT[i]-AT[i]; 
} 
for(int i=0;i<n;i++)
{ 
TAT[i]=WT[i]+BT[i]; 
AWT=AWT+WT[i]; 
} 
System.out.println("  PROCESS   BT      WT      TAT     "); 
for(int i=0;i<n;i++) 
{
System.out.println("    "+ i + "       "+BT[i]+"       "+WT[i]+"       "+TAT[i]);
} 
AWT=AWT/n; 
System.out.println("----------------------------------"); 
System.out.println("Avg Waiting Time="+AWT+"\n----------------------------------");

for(int i=0;i<n;i++) 
{ 
TAT[i]=WT[i]+BT[i]; 
ATAT=ATAT+TAT[i]; 
}

ATAT=ATAT/n; 
 
System.out.println("Avg Turn Around Time="+ATAT+"\n----------------------------------"); 


for (int i = 0; i<n; i++){
   ToT=TAT[i]+TAT[i]; 
   
}
 
System.out.println("Total Turn Around Time="+ToT+"\n----------------------------------"); 

for (int i = 0; i<n; i++){
   TWT=WT[i]+WT[i] ; 
   
}

System.out.println("Total Waiting Time="+TWT+"\n----------------------------------"); 

} 

} 