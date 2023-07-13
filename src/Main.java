import java.util.ArrayList;

public class Main {
   static ArrayList<Block> blockchain = new ArrayList<>();

   static ArrayList<Integer> blockchainHashes = new ArrayList<Integer>();
    public static void main(String[] args)
    {
        String[] firstTransac = {"ajeet sent 10 bitcoin to sj", "sj sent 5 bitcoin to abhay"};
        Block firstBlock = new Block(0, firstTransac);
        blockchain.add(firstBlock);
        blockchainHashes.add(firstBlock.getBlockHash());

        String[] secondTransac = {"arpit sent 4 bitcoin to himanshi" , "abhay sent 9 bitcoin to abhishek"};
        Block secondBlock = new Block(firstBlock.getBlockHash(), secondTransac);
        blockchain.add(secondBlock);
        blockchainHashes.add(secondBlock.getBlockHash());

        String[] thirdTransac = {"vikram sent 8 bitcoin to sandeep", "sandeep sent 9 bitcoin to saurabh"};
        Block thirdBlock = new Block(secondBlock.getBlockHash(), thirdTransac);
        blockchain.add(thirdBlock);
        blockchainHashes.add(thirdBlock.getBlockHash());


        System.out.println(blockchain);
        System.out.println(blockchainHashes);




    }
}