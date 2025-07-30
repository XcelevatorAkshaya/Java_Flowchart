public class FCP020 {
public static void main(String[] args) {
int a = 1;
int b = 18;
int c = 19;
int d = 20;
int m1, m3, m2, m4;
if (a > b) {
m1 = a;
m3 = b;
}
else
{
m1 = b;
m3 = a;
}
if (c > d) {
m2 = c;
m4 = d;
}
else
{
m2 = d;
m4 = c;
}
int max, secmax;
if (m1 > m2)
{
max = m1;
if (m2 > m3) {
secmax = m2;
}
else
{
secmax= m3;
}
}
else
{
max = m2;
if (m1 > m4) {
secmax= m1;
} else {
secmax = m4;
}
}
System.out.println(secmax);
}
}

