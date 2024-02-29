interface Calci{
  int getSum(int n1,int n2);
}
class CalciImp implements Calci{
  static int getSum(int n1,int n2){
return n1+n2;
}
}