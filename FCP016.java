public class FCP016{
public static void main(String[]args){
int year=2000;
if(year%4!=0){
System.out.println("no");
}
else if(year%100==0){
if(year%400==0){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
else{
System.out.println("yes");
}
}
}

