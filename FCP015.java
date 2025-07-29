public class FCP015{
public static void main(String[]args){
int a=5;
int b=10;
int c=15;
int d=12;
if(a>b){
if(a>c){
if(a>d){
System.out.println(a);
}
}
}
else if(b>c){
if(b>d){
System.out.println(b);
}
}
else if(c>d){
System.out.println(c);
}
else{
System.out.println(d);
}
}
}
