public class Queue {
    int  max,  size,  front, rear;
    int Q[];

public Queue (int n){
    max = n ;
    Create();
}
public void Create(){
    Q = new int [max];
    size = 0 ;
    front =  rear = -1;
}

public boolean IsEmpty(){
    if (size == 0){
        return true;
    }
    else{
        return false;
    }

public boolean IsFull(){
    if (size == max){
        return true;
    }
    else{
        return false;
    }
}
}
