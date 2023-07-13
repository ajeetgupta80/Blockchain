import java.util.Arrays;

public class Block {

    private int preHash;
    private String[] transac;

//    EACH BLOCK WILL ALSO HAVE ITS OWN HASH
    private int blockHash;

    public Block(int preHash, String[] transac){
        this.preHash = preHash;
        this.transac = transac;

        Object[] contens = {Arrays.hashCode(transac),preHash};

//        defining the hash of current block --> currentblockhash = previoushash+ currenthash
        this.blockHash = Arrays.hashCode(contens);

    }

    public int getPreHash(){
        return preHash;
    }
    public String[] getTransac(){
        return transac;
    }

    public int getBlockHash(){
        return blockHash;
    }

}
