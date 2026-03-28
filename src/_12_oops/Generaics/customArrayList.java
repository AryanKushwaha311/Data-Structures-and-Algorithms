
class myArrayList{
    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    myArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        else if(data.length != DEFAULT_SIZE){
            data[size]=num;
            size++;
        }
    }

    private boolean isFull(){
        if (data.length==DEFAULT_SIZE){
            int[] newData=new int[DEFAULT_SIZE*2];
            data=newData;
        }
        return true;
    }
    private void resize(){

    }

    public int remove(int index){
        int num = data[index];
        return num;
    }
}
public class customArrayList{
    public static void main(String[] args) {
        myArrayList obj = new myArrayList();
    }
}