class sum {
    public static void main(String[] args) {
        int n=11;
        int d,sumn =0;
        while(n!=0){
            d=(n%10);
            sumn = sumn + d ;
            n=n/10;
        }
        System.out.println("Number is Even "+sumn);
    }
  }