int rv = 0;
        int p = 1;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            rv += rem*p;
            p = p * 2;
        }
        return rv;