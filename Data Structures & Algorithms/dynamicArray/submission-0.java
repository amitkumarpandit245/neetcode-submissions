class DynamicArray {
    int[] aka;
    int size=0;
    int capacity=0;
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        if(this.capacity>0){
            aka=new int[this.capacity];
        }
    }

    public int get(int i) {
        return aka[i];
    }

    public void set(int i, int n) {
        aka[i]=n;
    }

    public void pushback(int n) {
        if(this.size==capacity){
            resize();
        }
        aka[this.size++]=n;

    }

    public int popback() {
        return aka[--this.size];
    }

    public void resize() {
        this.capacity=this.capacity*2;
        int[] temp=new int[this.capacity];
        for(int i=0;i<size;i++){
            temp[i]=aka[i];
        }
        aka=temp;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
