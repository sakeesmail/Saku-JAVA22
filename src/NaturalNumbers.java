class Multiples{
  static void findMultiples(int n){
    for(int i = 0; i <= n; i++)
      if(i % 3 == 0 && i % 5 == 0)
        System.out.println(i);
  }
}

