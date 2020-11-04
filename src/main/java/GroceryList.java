public class GroceryList {
    private String[] arr;

    public GroceryList(){
        this.arr = new String[10];
    }

    public void add(String item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                arr[i] = item;
                break;
            }
        }
    }

    public void remove(String item){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == item){
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
            }
        }
        arr[arr.length - 1] = null;
    }

    public String toString(){
        String str = (this.arr[0] + " " + this.arr[1] + " " + this.arr[2] + " " + this.arr[3] + " " + this.arr[4] + " " + this.arr[5] + " " + this.arr[6] + " " + this.arr[7] + " " + this.arr[8] + " " + this.arr[9]);
        return str;
        }
        
    }
