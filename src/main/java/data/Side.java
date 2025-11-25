package data;

//THIS enum is about describing the color RED or BLACK
public enum Side {
    RED, BLACK;

    public Side opposite(){
        if(this==RED){
            return BLACK;
        }
        else{
            return RED;
        }
    }

    @Override
    public String toString(){
        if(this==RED){
            return "R";
        }
        else{
            return "B";
        }
    }
}
