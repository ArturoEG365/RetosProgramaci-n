class retos{
    public static void main( String[] args) {
        for(int a = 1; a <= 100; a++){
            if (a%3==0 && a%5==0) {
                System.out.println("fizzbuzz" + " " +a);
            }else{
                if (a%3==0) {
                    System.out.println("fizz" + " " + a);
                }else{
                    if (a%5==0) {
                        System.out.println("buzz"+ " " + a);
                    }
                    else{
                        System.out.println(a);
                    }
                }
            }
        }
    }
}