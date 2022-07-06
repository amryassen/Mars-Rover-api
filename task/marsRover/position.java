package task.marsRover;
public class position {
    private int x,y;
    public position(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }

    public void SetX(int x){
        this.x = x;
    }
    
    public void SetY(int y){
        this.y = y;
    }

    public void IncrementX(){
        x++;
    }

    public void IncrementY(){
        y++;
    }

    public void DecrementX(){
        x--;
    }

    public void DecrementY(){
        y--;
    }


    
    
}
