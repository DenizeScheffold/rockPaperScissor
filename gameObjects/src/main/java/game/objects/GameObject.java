package game.objects;

//Comparable är ett interface som redan finns i java - och specificeras för oss på rad 19-20.
// Då behöver vi ha GameObject inom <>.

public class GameObject implements Comparable<GameObject> {
    private int id;
    private String name;

    //@formatter: off
    private int[][] comparison = {
            //          rock      paper      scissor
            /*rock*/{0, -1, 1,},
            /*paper*/{1, 0, -1,},
            /*scissor*/{-1, 1, 0,},
    };

//@formatter:on

    public int compareTo(GameObject other) {
        return comparison[id][other.id];

    }


    protected void setId(int id) {
        this.id = id;
    }


    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
