import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner kbd = new Scanner(System.in);
  int n = kbd.nextInt();
  int[] a = new int[n];
  for(int i = 0;i < n;i++)
    a[i] = kbd.nextInt();
  for(int i = n-1;i >= 0;i--)
    System.out.println(a[i]);
  }
}