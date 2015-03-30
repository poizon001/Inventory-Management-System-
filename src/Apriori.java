/*
7
4
0.6
1 2 3 4
1 2
2 3 4
2 3
1 2 4
3 4
2 4

2
4
0.6
1 2 3
1 2 4
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Apriori {
  
    private List<int[]> itemsets ;
    private List<int[]> Output ;
    private int numItems;
	private int numTransactions;
	private double minSup;
	public ArrayList<String> Data; 
 
//    public static void main(String[] args) throws Exception {
//            Apriori ap = new Apriori();
//    }

	public Apriori(ArrayList<String> d,int tr,int nit,Double sup) throws Exception
	{
	   	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
                Data =  d;
                numTransactions = tr;
                numItems = nit;
                //numItems +=1;
                minSup = sup;
//                log(numTransactions);
//                log(numItems);
//                log(minSup);
//                for( int i = 0; i < numTransactions; i++) {
//                    String s = inp.readLine();
//                    Data.add(s);
////                    log(s);
//                }
//                    
//                for( int i = 0; i < tr; i++) {
//                    System.out.println(Data.get(i));
//                    
//                }    
               Output = new ArrayList<int[]>();
               
	}
 
	public  List<int[]> go() throws Exception {  
	 
		createItemsetsOfSize1();
//                for(int x[] : itemsets){
//                    
//         
//                    System.out.println(x[0]);
//                }
		int itemsetNumber=1; //the current itemset being looked at
		int nbFrequentSets=0;
                //log(itemsets.size());
		while (itemsets.size()>0)
		{
	 
			calculateFrequentItemsets();
	 
			if(itemsets.size()!=0)
			{
				nbFrequentSets+=itemsets.size();
				createNewItemsetsFromPreviousOnes();
			}	
	 
			itemsetNumber++;
		}
                return Output;
		//log("Found "+nbFrequentSets+ " frequents sets for support "+(minSup*100)+"% (absolute "+Math.round(numTransactions*minSup)+")");
	}
	 
	private void foundFrequentItemSet(int[] itemset, int support) {
		//System.out.println(Arrays.toString(itemset) + " ("+ ((support / (double) numTran)+" "+support+")");
                if(itemset.length > 1)
                    Output.add(itemset);
                    //System.out.println(Arrays.toString(itemset));
        }
	 
	private void log(String message) {
		System.out.println(message);
	}
        private void log(Double message) {
		System.out.println(message);
	}private void log(int message) {
		System.out.println(message);
	}
	private void createItemsetsOfSize1() {
		itemsets = new ArrayList<int[]>();
		for(int i=0; i<numItems; i++)
		{
			int[] cand = {i+1};
			itemsets.add(cand);
                        //System.out.println(cand[0]);
		}
	}

	private void createNewItemsetsFromPreviousOnes()
	{
		int currentSizeOfItemsets = itemsets.get(0).length;
		//log("Creating itemsets of size "+(currentSizeOfItemsets+1)+" based on "+itemsets.size()+" itemsets of size "+currentSizeOfItemsets);
		HashMap<String, int[]> tempCandidates = new HashMap<String, int[]>(); //temporary candidates

		for(int i=0; i<itemsets.size(); i++)
		{
			for(int j=i+1; j<itemsets.size(); j++)
			{
				int[] X = itemsets.get(i);
				int[] Y = itemsets.get(j);
	 
				assert (X.length==Y.length);

				int [] newCand = new int[currentSizeOfItemsets+1];
				for(int s=0; s<newCand.length-1; s++) {
					newCand[s] = X[s];
				}
				int ndifferent = 0;
				// then we find the missing value
				for(int s1=0; s1<Y.length; s1++)
				{
					boolean found = false;
				// is Y[s1] in X?
					for(int s2=0; s2<X.length; s2++) {
						if (X[s2]==Y[s1]) {
							found = true;
							break;
						}
					}
					if (!found){ // Y[s1] is not in X
						ndifferent++;
						newCand[newCand.length -1] = Y[s1];
					}
				}
				assert(ndifferent>0);
				if (ndifferent==1) {
					Arrays.sort(newCand);
					tempCandidates.put(Arrays.toString(newCand),newCand);
				}
			}
		}
	//set the new itemsets
		itemsets = new ArrayList<int[]>(tempCandidates.values());
		//log("Created "+itemsets.size()+" unique itemsets of size "+(currentSizeOfItemsets+1));
	 
	}
 
	private void line2booleanArray(String line, boolean[] trans) {
		Arrays.fill(trans, false);
		StringTokenizer stFile = new StringTokenizer(line, " "); //read a line from the file to the tokenizer
		while (stFile.hasMoreTokens())
		{
			int parsedVal = Integer.parseInt(stFile.nextToken());
			trans[parsedVal-1]=true; //if it is not a 0, assign the value to true
		}
//                log(line);
//                for (boolean b:trans){
//                    System.out.print(b + " ");
//                }
	}
	 

	private void calculateFrequentItemsets() throws Exception
	{
		//log("Passing through the data to compute the frequency of " + itemsets.size()+ " itemsets of size "+itemsets.get(0).length);
	 
		List<int[]> frequentCandidates = new ArrayList<int[]>(); //the frequent candidates for the current itemset
	 
		boolean match; //whether the transaction has all the items in an itemset
		int count[] = new int[itemsets.size()]; //the number of successful matches, initialized by zeros
	 
		boolean[] trans = new boolean[numItems];
		for (int i = 0; i < numTransactions; i++) {
		 
			String line = Data.get(i);
                       // log(line);
			line2booleanArray(line, trans);
		 
			for (int c = 0; c < itemsets.size(); c++) {
				match = true; // reset match to false
				int[] cand = itemsets.get(c);
                                //log(cand[0] + "after" + cand.length);
				for (int xx : cand) {
					if (trans[xx-1] == false) {
						match = false;
						break;
					}
                                       // log(xx);
				}
				if (match) { // if at this point it is a match, increase the count
					count[c]++;
                                       // log(Arrays.toString(cand)+" is contained in trans "+i+" ("+line+")");
				}
			}
		} 
		for (int i = 0; i < itemsets.size(); i++) {
                        
                        
			if ((count[i]/(double) (numTransactions)) >= minSup) {
				foundFrequentItemSet(itemsets.get(i),count[i]);
				frequentCandidates.add(itemsets.get(i));
                                /*log("Set" + i + "{ " );
                        for (int n : itemsets.get(i))
                            System.out.print(n);
                            
                       log( " }" + "  " + count[i]/(double)numTransactions);*/
			}
		//else log("-- Remove candidate: "+ Arrays.toString(candidates.get(i)) + " is: "+ ((count[i] / (double) numTransactions)));
		}
		itemsets = frequentCandidates;
	}
}
