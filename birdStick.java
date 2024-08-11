
import java.util.*;
public class birdStick {
    public static int[] findPos(int[] forest,int bird){
        ArrayList<Integer> arr=new ArrayList<>();
        int stick=0;
        int i;
        while(stick<100){
            i=bird+1;
            while(true){
                if(forest[i]!=0){
                    stick=stick+forest[i];
                    arr.add(i);
                    forest[i]=0;
                    break;
                }
                i++;
            }    
            if(stick>100){
                break;
            }
            i=bird-1;
            while(true){
                if(forest[i]!=0){
                    stick=stick+forest[i];
                    arr.add(i);
                    forest[i]=0;
                    break;
                }
                i--;

            }


        }


        int n=arr.size();
        int[] pos=new int[n];
        for(int j=0;j<n;j++){
            pos[j]=arr.get(j);

        }
        return pos;

    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        /*int n=inp.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=inp.nextInt();
        }*/
        int arr[]={10,0,45,0,0,0,15,0,0,40,0};
        int[] pos=findPos(arr,4);
        for(int e:pos){
            System.out.print(e+" ");
        }
    }
    
}
