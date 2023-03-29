public class checksum {
    int[] check(int[] num){
        int a=num[0],b=num[8],c=num[16],d=num[24];
        for(int i=0;i<8;i++){
            a=a*10+num[i+1];
            b=b*10+num[8+i+1];
            c=c*10+num[16+i+1];
            d=d*10+num[24+i+1];
        }
        
    }
}
