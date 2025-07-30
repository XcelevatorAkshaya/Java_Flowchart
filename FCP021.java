public class FCP021 {
public static void main(String[] args) {
int a = 12;
int b = 45;
int c = 33;
int d = 67;
int e = 21;
int f = 90;
int g = 88;
int h = 17;
int m1, m2, m3, m4, m5, m6, m7, m8;
if (a > b)
{
m1 = a;
m2 = b;
}
else
{
m1 = b;
m2 = a;
}
if (c > d) {
m3 = c;
m4 = d;
}
else
{
m3 = d;
m4 = c;
}
if (e > f) {
m5 = e;
m6 = f;
}
else
{
m5 = f;
m6 = e;
}
if (g > h) {
m7 = g;
m8 = h;
} else
{
m7 = h;
m8 = g;
}
int max1, max2, sec1, sec2;
if (m1 > m3) {
max1 = m1;
sec1 = m3;
} 
else
{
max1 = m3;
sec1 = m1;
}
if (m5 > m7)
{
max2 = m5;
sec2 = m7;
}
else 
{
max2 = m7;
sec2 = m5;
}
int Max1,SecMax1;
if (max1 > max2) {
Max1 = max1;
if (max2 > sec1) {
SecMax1 = max2;
} 
else 
{
SecMax1 = sec1;
}
}
else {
Max1 = max2;
if
(max1 > sec2) {
SecMax1 = max1;
}
else {
SecMax1= sec2;
}
}
System.out.println(SecMax1);
}
}
